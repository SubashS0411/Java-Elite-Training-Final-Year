import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocalAI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ask Qwen a question: ");
        String input = sc.nextLine();

        // Escape double quotes so they don't break the JSON structure
        String safeInput = input.replace("\"", "\\\"");

        String payload = """
            {
                "model": "qwen2.5-coder:3b",
                "prompt": "%s",
                "stream": false
            }
            """.formatted(safeInput);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:11434/api/generate"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();

        HttpClient client = HttpClient.newHttpClient();

        System.out.println("Thinking...");
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String rawJson = response.body();

        // 1. Print the raw JSON block
        System.out.println("\n--- 1. Full Raw JSON ---");
        System.out.println(rawJson);

        // 2. Extract and print only the text content
        System.out.println("\n--- 2. Clean Text Content ---");

        // This regex looks for everything inside the "response" key right before the "done" key
        Pattern pattern = Pattern.compile("\"response\":\"(.*?)\",\"done\"", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(rawJson);

        if (matcher.find()) {
            // Extract the text
            String textContent = matcher.group(1);

            // The JSON response escapes newlines (\n) and quotes (\").
            // We need to un-escape them so Java prints them properly in the console.
            textContent = textContent
                    .replace("\\n", "\n")
                    .replace("\\\"", "\"")
                    .replace("\\\\", "\\");

            System.out.println(textContent);
        } else {
            System.out.println("[Error: Could not extract response text from JSON]");
        }

        sc.close();
    }
}