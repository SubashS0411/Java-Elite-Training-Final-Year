import java.util.Scanner;

public class RemoveSpaceString {
    public static void main(String[] args) {
//        String str=" Hello World ";
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String remove=str.replace(" ","");
        System.out.println(remove);
    }
}
