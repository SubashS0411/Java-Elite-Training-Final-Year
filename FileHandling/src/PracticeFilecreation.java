import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PracticeFilecreation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sentence=s.nextLine();
        String filename="data.txt";
        try(FileWriter writer=new FileWriter(filename)){
            writer.write(sentence);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(Scanner fileScanner=new Scanner(new File(filename))){
            int wordcount=0;
            while(fileScanner.hasNext()){
                fileScanner.next();
                wordcount++;
            }
            System.out.println(wordcount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
