public class Board {
    public static void main(String[] args) {
        String[][] moimoi=new String[5][5];
        for (int i = 0; i < moimoi.length; i++) {
            for (int j = 0; j < moimoi[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) moimoi[i][j] ="Black" ;
                    else moimoi[i][j] = "White";
                }
                else{
                    if (j % 2 == 0) moimoi[i][j]="White";
                    else moimoi[i][j] ="Black" ;
                }
            }
        }
        for (String[] strings : moimoi) {
            for (String string : strings) System.out.print(string + " ");
            System.out.println();
        }
    }
}
