
package linkedlist;

/**
 * Demonstrates how to find the last node in a singly linked list.
 */
public class FindLastNode {

    static void main(String[] args) {
        Node<Integer> head = createLinkedList();

        Node<Integer> lastNode = findLastNode(head);

        if (lastNode == null) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The last node is: " + lastNode.data);
        }
    }

    /**
     * Creates and returns a sample singly linked list.
     * <p>
     * Linked list: 24 -> 45 -> 34 -> 67 -> null
     *
     * @return the head node of the linked list
     */
    private static Node<Integer> createLinkedList() {
        Node<Integer> head = new Node<>(24);
        head.next = new Node<>(45);
        head.next.next = new Node<>(34);
        head.next.next.next = new Node<>(67);

        return head;
    }

    /**
     * Finds and returns the last node of a singly linked list.
     * <p>
     * The method traverses the list until it reaches a node
     * whose next reference is null.
     *
     * @param <T>  the type of data stored in the nodes
     * @param head the head node of the linked list
     * @return the last node, or null if the list is empty
     * <p>
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static <T> Node<T> findLastNode(Node<T> head) {

        // An empty linked list has no last node.
        if (head == null) {
            return null;
        }

        Node<T> current = head;

        // Traverse until we reach the last node.
        while (current.next != null) {
            current = current.next;
        }

        return current;
    }
}
