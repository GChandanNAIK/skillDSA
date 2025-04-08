class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortedLinkedList {
    
    // Function to remove duplicates
    public static void removeDuplicates(Node head) {
        Node current = head;
        
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip duplicate
            } else {
                current = current.next; // Move to next distinct element
            }
        }
    }

    // Helper function to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original list:");
        printList(head);

        removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
