import java.util.Scanner;
public class ArrayStack {
    static int size=10,top=-1;
    static int[] stack=new int[size];
    static void push(int data){
    if(top>size-1) System.out.println("Stack Overflow");
    else{
        stack[++top]=data;
        System.out.println("Inserted element: "+data);
    }
    }
    static String pop(){
        if(top<0) return "Stack Underflow";
        return "data poped from stack: "+stack[top--]+"";
    }
    static String  peek(){
        if(top<0) return "Stack Underflow";
        return "data from stack: "+stack[top]+"";
    }
    static void display(){
        if(top<0){
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >=0 ; i--) {
            System.out.print(stack[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 0,data; i <num ;data= sc.nextInt(),push(data), i++);
        System.out.println(pop());
        System.out.println(peek());
        display();
    }
}
