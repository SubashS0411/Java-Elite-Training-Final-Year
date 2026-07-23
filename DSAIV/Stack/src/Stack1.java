public class Stack1 {
    Node top;
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
        System.out.println("Pushed: "+data);

    }
    public Object pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return null;
        }
        System.out.println("top: "+top.data);
        top=top.next;
        return null;
    }
    public void peek(){
        if(isempty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("top: "+top.data);
    }
    public boolean isempty(){
        return top==null;
    }
    public void display(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        Node current=top;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(5);
        s.push(10);
        s.push(15);

        s.display(); // Prints 15, 10, 5
        s.peek();    // Safely peeks at 15
        s.pop();     // Removes 15
        s.display();
    }
}
class Node {

    int data;
    Node next;

    //    Node top;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}




