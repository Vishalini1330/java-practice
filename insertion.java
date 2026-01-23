import java.util.LinkedList;
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null; 
    }
}
class insert{
    Node head;
    public void insertAtBegin(int x){
        Node A = new Node(x);
        A.next = head;
        head = A;
    }
    public void insertAtEnd(int x){
        Node A = new Node(x);
        if(head == null){
            head = A;
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = A;
        }
    }

}

public class insertion{
    public static void main(String args[]){
        insert list = new insert();
        list.insertAtEnd(10);
        list.insertAtBegin(20);
        list.insertAtEnd(30);
        Node curr = list.head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        
       
    }
}