public class ReverseLinkedList {
    Node head;
    public Node  reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void display(){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        ReverseLinkedList list=new ReverseLinkedList();
        for (int i = 1; i < 20; i++) {
            list.insertAtHead(i*2);
        }
        list.display();
        System.out.println();
        list.reverse();
        list.display();
    }
}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}