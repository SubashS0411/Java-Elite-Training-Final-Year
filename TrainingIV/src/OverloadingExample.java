public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println(add(10,20,30));
        System.out.println(add(10,20));
        System.out.println(add("T ","V ","K"));
        print("Gopi ",38);
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static String add(String a,String b,String c){
        return a+b+c;
    }
    public static void print(String a,int b){
        System.out.println(a+b);
    }

}
