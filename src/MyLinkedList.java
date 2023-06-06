
class Node{
    public int data;
    public Node next;
}

public class MyLinkedList {
    Node head;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=head;
        head=newNode;
    }

    public void insertAfter(int data){
        Node cur = head;
        while(cur.next != null){
            cur=cur.next;
        }
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        cur.next=newNode;

    }

    public void deleteFirst(){
        Node cur = head;
        head= head.next;
        System.out.println("deleted element: "+cur.data);
    }

    public void deleteAfter(int data){
        Node cur = head;
        while(cur.next != null && cur.data != data){
            cur = cur.next;
        }
        if(cur.next != null){
            System.out.println("removed element: "+cur.next.data);
            cur.next=cur.next.next;

        }
    }
    public void dispList(){
        Node cur = head;
        while(cur.next != null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println(cur.data);
    }
    public static void main(String[] args) {
        MyLinkedList list= new MyLinkedList();
        list.insertFirst(10);
        list.insertAfter(20);
        list.insertAfter(30);
        list.insertAfter(40);
        list.insertAfter(50);
        list.insertAfter(60);
        list.insertAfter(70);
        list.insertAfter(80);
        list.insertAfter(90);
        list.insertAfter(100);

        list.dispList();
        list.deleteFirst();
        list.deleteFirst();
        list.dispList();
        list.deleteAfter(40);
        list.dispList();

    }
}
