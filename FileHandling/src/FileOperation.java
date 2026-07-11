import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        File file=new File("File.txt");
        file.createNewFile();
        FileWriter writer=new FileWriter("File.txt");
        writer.write("Evofox");
        writer.write("\nThis is nari mouse");
        writer.append("Worth Buying product");
        writer.close();
        Scanner reader=new Scanner(file);
        while(reader.hasNext()){
            System.out.println(reader.nextLine());
        }
        reader.close();

    }
}
