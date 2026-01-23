public class reversell {
    public static void main(String args[]) {
        insert list = new insert();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);

        System.out.println("Original list:");
        Node curr = list.head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

        // Call reverse
        list.reverselist();

        System.out.println("Reversed list:");
        curr = list.head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}