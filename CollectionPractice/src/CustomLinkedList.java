public class CustomLinkedList {
    Node head;
    public void insertAtPosition(int index,int data){
        if(index==0){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            return;
        }
        Node curr=head;
        int count=0;
        while (curr!=null && count<index-1){
            curr=curr.next;
            count++;
        }
        if(curr==null){
            System.out.println("Index out of Bounds");
            return;
        }
        Node newNode=new Node(data);
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public void deleteByValue(int key){
        if(head==null) return;
        if(head.data==key){
            head=head.next;
            return;
        }
        Node current=head;
        while (current.next!=null && current.next.data!=key){
            current=current.next;
        }
        if(current.next==null){
            System.out.println("Not found");
            return;
        }
        current.next=current.next.next;
    }
    public void display(){
        Node current=head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        CustomLinkedList list=new CustomLinkedList();

        list.insertAtPosition(0,5);
        list.insertAtPosition(1,2);
        list.insertAtPosition(3,5);
//        list.deleteByValue(5);
        list.display();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

}
