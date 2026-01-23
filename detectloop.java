class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    public void insert(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Detect loop using Floyd’s Cycle Detection
    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move one step
            fast = fast.next.next;     // move two steps

            if (slow == fast) {        // collision means loop exists
                return true;
            }
        }
        return false;
    }
}

public class detectloop {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Create a loop manually for testing
        list.head.next.next.next.next = list.head.next; // 40 → 20

        if (list.detectLoop()) {
            System.out.println("Loop detected in the linked list!");
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}