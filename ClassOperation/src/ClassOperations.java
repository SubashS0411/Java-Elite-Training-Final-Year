public class ClassOperations {
    public static void main(String[] args) {
        Operation op=new Operation(5,10);
//        op.add();
    }
}
class Operation{
    int num1;
    int num2;
    Operation(int num,int num2){
        this.num1=num;
        this.num2=num2;
        System.out.println("Add "+(num1+num2));
    }
    public void add(){
        System.out.println("Adding "+(num1+num2));
    }
}
