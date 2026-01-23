class LinkedList {
    Node head; // head of list

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Delete node by value
    public void deleteNodeByValue(int key) {
        Node currNode = head;
        Node prevNode = null;

        // CASE 1: head node holds the key
        if (currNode != null && currNode.data == key) {
            head = currNode.next;
            System.out.println(key + " found and deleted (head case)");
            return;
        }

        // CASE 2: search for key
        while (currNode != null && currNode.data != key) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        // If key found
        if (currNode != null) {
            prevNode.next = currNode.next;
            System.out.println(key + " found and deleted");
        } else {
            // CASE 3: key not found
            System.out.println(key + " not found");
        }
    }

    // Insert at end
    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    // Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Driver class
public class deletion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Created List: ");
        list.printList();

        list.deleteNodeByValue(30);
        System.out.print("List after deleting 30: ");
        list.printList();

        list.deleteNodeByValue(10);
        System.out.print("List after deleting 10: ");
        list.printList();

        list.deleteNodeByValue(99);
        System.out.print("List after trying to delete 99: ");
        list.printList();
    }
}

