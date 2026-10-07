package Collections;

class CustomLinkedList {
    // The head pointer points to the first node in the list
    private Node head;

    // Inner class defining what a single element (Node) looks like
    private static class Node {
        int data;
        Node next; // Reference to the next node in the sequence

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert a new element at the very front of the list: O(1) time complexity
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point new node to current head
        head = newNode;      // Move head pointer to the new node
    }

    // Traverse and display list items: O(n) time complexity
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Advance to the next element
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CustomLinkedList myList = new CustomLinkedList();

        myList.insertAtFront(30);
        myList.insertAtFront(20);
        myList.insertAtFront(10);

        // Output will show elements printed starting from head
        myList.printList(); // Output: 10 -> 20 -> 30 -> null
    }
}

