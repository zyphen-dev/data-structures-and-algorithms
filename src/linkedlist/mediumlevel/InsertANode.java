package linkedlist.mediumlevel;

import linkedlist.Node;

/**
 * Provides utility methods to demonstrate inserting a node at a specific
 * 1-based position within a singly linked list.
 */
public class InsertANode {

    /**
     * Application entry point that creates a sample linked list, inserts a node
     * with value {@code 100} at position {@code 4}, and prints the list before
     * and after the insertion.
     *
     * @throws Exception if the insertion index is invalid or out of bounds
     */
    static void main() throws Exception {
        Node<Integer> head = createLinkedList();
        printLinkedList(head);
        Node<Integer> result = insertNodeAt(100, 4, head);
        printLinkedList(result);
    }

    /**
     * Inserts a new node containing the specified data at a 1-based index in a
     * singly linked list.
     *
     * <p><b>Complexity:</b></p>
     * <ul>
     *   <li><b>Time Complexity:</b> {@code O(k)} where {@code k} is the target
     *       {@code index} ({@code O(n)} in the worst case when inserting at the tail).</li>
     *   <li><b>Space Complexity:</b> {@code O(1)} auxiliary space.</li>
     * </ul>
     *
     * @param data  the integer value to store in the newly created node
     * @param index the 1-based position at which to insert the new node
     *              (e.g., {@code 1} inserts at the head)
     * @param head  the head node of the target linked list (may be {@code null}
     *              only if {@code index == 1})
     * @return the head node of the modified linked list
     * @throws IllegalArgumentException  if {@code index} is less than {@code 1}
     * @throws IndexOutOfBoundsException if {@code index} exceeds {@code length + 1}
     * @throws Exception                 for general execution errors
     */
    private static Node<Integer> insertNodeAt(int data, int index, Node<Integer> head) throws Exception {
        Node<Integer> curr = head;

        // Position must be 1 or greater
        if (index < 1) {
            throw new IllegalArgumentException("Index must be >= 1");
        }

        Node<Integer> node = new Node<>(data);

        // Insert at the beginning (also handles an empty list)
        if (index == 1) {
            node.next = head;
            return node;
        }

        // Reach the node immediately before the insertion position
        for (int i = 1; i < index - 1; i++) {
            if (curr == null) {
                throw new IndexOutOfBoundsException(
                        "Index is greater than length + 1");
            }

            curr = curr.next;
        }

        // Validate the previous node
        if (curr == null) {
            throw new IndexOutOfBoundsException(
                    "Index is greater than length + 1");
        }

        // Insert the new node
        node.next = curr.next;
        curr.next = node;

        return head;
    }

    /**
     * Creates and returns a sample singly linked list of integers.
     *
     * <p>Structure: {@code 24 -> 45 -> 34 -> 67 -> 54 -> 89 -> null}</p>
     *
     * @return the head node of the sample linked list
     */
    private static Node<Integer> createLinkedList() {
        Node<Integer> head = new Node<>(24);
        head.next = new Node<>(45);
        head.next.next = new Node<>(34);
        head.next.next.next = new Node<>(67);
        head.next.next.next.next = new Node<>(54);
        head.next.next.next.next.next = new Node<>(89);

        return head;
    }

    /**
     * Prints all elements of a singly linked list sequentially to standard output,
     * separated by {@code " -> "} and ending with {@code "null"}.
     *
     * @param head the head node of the linked list to print
     * @param <T>  the type of data stored in the nodes
     */
    private static <T> void printLinkedList(Node<T> head) {
        Node<T> curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}
