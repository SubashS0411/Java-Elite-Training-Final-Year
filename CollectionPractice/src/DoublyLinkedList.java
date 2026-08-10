public class DoublyLinkedList {
    DoublyNode head;
    public void insertAtHead(int data){
        DoublyNode newNode=new DoublyNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void insertAtTail(int data){
        DoublyNode newNode=new DoublyNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        DoublyNode current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        newNode.prev=current;
        }
    public void display(){
        System.out.println("Forward");
        DoublyNode current=head;
        while(current!=null){
            System.out.print(current.data+"<->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void revDisplay(){
        DoublyNode current=head;
        while (current.next!=null){
            current=current.next;
        }
        while (current!=null){
            System.out.print(current.data+"<->");
            current=current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0) {list.insertAtHead(i);}
            else{list.insertAtTail(i); }


        }
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.insertAtHead(7);
        list.display();
        list.revDisplay();
    }
}
class DoublyNode{
    int data;
    DoublyNode prev;
    DoublyNode next;
    DoublyNode(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
