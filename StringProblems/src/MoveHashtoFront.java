public class MoveHashtoFront {
    public static void main(String[] args) {
        String str="Move#Hash#to#Front";
        StringBuilder hashes=new StringBuilder();
        StringBuilder letter=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='#'){
                hashes.append(ch);
            }
            else{
                letter.append(ch);
            }
        }
        System.out.println(hashes.append(letter));
    }
}
