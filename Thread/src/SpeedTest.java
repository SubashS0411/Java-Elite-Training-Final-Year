import java.io.*;
import java.util.*;

public class SpeedTest {

    public static void main(String[] args) {
        System.out.println("Generating 1,000,000 numbers for the test...");

        // 1. Generate a massive string of 1 million numbers separated by spaces
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i).append(" ");
        }

        // Convert the string into a simulated "Input Stream" (like typing on a keyboard)
        byte[] inputData = sb.toString().getBytes();

        System.out.println("Data generated! Starting the race...\n");

        // ==========================================
        // TEST 1: The Scanner (The Luxury SUV)
        // ==========================================
        System.out.println("1. Running Scanner...");
        Scanner sc = new Scanner(new ByteArrayInputStream(inputData));

        long scannerStartTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sc.nextInt();
        }
        long scannerEndTime = System.currentTimeMillis();
        long scannerTotalTime = scannerEndTime - scannerStartTime;

        System.out.println("-> Scanner finished in: " + scannerTotalTime + " milliseconds\n");

        // ==========================================
        // TEST 2: The FastReader (The F1 Race Car)
        // ==========================================
        System.out.println("2. Running FastReader...");
        FastReader fr = new FastReader(new ByteArrayInputStream(inputData));

        long fastStartTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            fr.nextInt();
        }
        long fastEndTime = System.currentTimeMillis();
        long fastTotalTime = fastEndTime - fastStartTime;

        System.out.println("-> FastReader finished in: " + fastTotalTime + " milliseconds\n");

        // ==========================================
        // THE RESULTS
        // ==========================================
        System.out.println("==========================================");
        System.out.println("RESULTS: FastReader was roughly " + (scannerTotalTime / fastTotalTime) + " times faster!");
        System.out.println("==========================================");
    }

    // ==========================================
    // Our Custom FastReader Class 
    // (Slightly modified to accept our simulated data stream)
    // ==========================================
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        // Modified to take any InputStream so we can feed it our test data
        public FastReader(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}