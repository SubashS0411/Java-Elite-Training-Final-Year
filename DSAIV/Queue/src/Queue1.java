public class Queue1 {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display(); // Prints: 10 -> 20 -> 30 -> null
        q.peek();
        q.dequeue();
        q.display();
        q.peek();
        q.dequeue();
        q.display();
    }
    Node1 front=null;
    Node1 rear=null;
    public void enqueue(int data){
        Node1 newNode=new Node1(data);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    public void peek(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data);
    }
    public void display(){
        if (front==null){
            System.out.println("Queue is empty");
            return;
        }
        Node1 current = front;
        System.out.print("Queue (Front to Rear): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data=data;
        this.next=null;
    }
}
