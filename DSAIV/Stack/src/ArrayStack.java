import java.util.Arrays;

public class ArrayStack {
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(3);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40); // This will trigger our "Stack Overflow!" check

        s.display(); // Prints 30, 20, 10
        s.pop();     // Removes 30
        s.display();
    }
    int[] arr;
    int capacity;
    int top;
    public ArrayStack(int size){
        this.capacity=size;
        this.arr=new int[capacity];
        this.top=-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isempty(){
        return top==-1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack overflow"+data);
            return;
        }
        top++;
        arr[top]=data;
        System.out.println("Inserted element"+data);

    }
    public void pop(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        System.out.println("Removed Element"+arr[top]);
        top--;
    }
    public void peek(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        System.out.println("Removed Element"+arr[top]);
    }
    public void display(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        for (int i = top; i >=0 ; i--) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
