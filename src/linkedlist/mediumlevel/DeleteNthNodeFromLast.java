
package linkedlist.mediumlevel;

import linkedlist.Node;

public class FindNthNodeFromLast {

    static void main() {
        Node<Integer> head = createLinkedList();

        // Delete the 6th node from the end.
        head = deleteNthNodeFromEnd(6, head);

        // Print the updated linked list.
        printLinkedList(head);
    }

    /**
     * Deletes the Nth node from the end of a singly linked list.
     *
     * <p>Approach: Brute Force (Two Traversals)</p>
     *
     * <p>Steps:</p>
     * <ol>
     *     <li>Traverse the linked list to calculate its length.</li>
     *     <li>Calculate the position of the node to delete
     *         from the beginning using {@code length - target}.</li>
     *     <li>If the target is equal to the list length,
     *         the head node needs to be deleted.</li>
     *     <li>Otherwise, traverse to the node immediately
     *         before the target node.</li>
     *     <li>Update the previous node's next reference to
     *         skip the target node.</li>
     * </ol>
     *
     * <p>Example:</p>
     * <pre>
     * Input:
     * 24 -> 45 -> 34 -> 67 -> 54 -> 89 -> null
     * target = 2
     *
     * Output:
     * 24 -> 45 -> 34 -> 67 -> 89 -> null
     * </pre>
     *
     * @param target the position of the node to delete
     *               from the end (1-based indexing)
     * @param head   the head node of the linked list
     * @param <T>    the type of data stored in the nodes
     * @return the updated head of the linked list
     * @throws IllegalArgumentException if target is less
     *                                  than 1 or greater
     *                                  than the list length
     */
    private static <T> Node<T> deleteNthNodeFromEnd(
            int target, Node<T> head) {

        if (target < 1) {
            throw new IllegalArgumentException(
                    "Target must be greater than or equal to 1"
            );
        }

        // Step 1: Calculate the length of the linked list.
        Node<T> curr = head;
        int length = 0;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Validate that the target exists in the linked list.
        if (target > length) {
            throw new IllegalArgumentException(
                    "Target exceeds the linked list length"
            );
        }

        // Step 2: Handle the case where the head needs to be deleted.
        if (target == length) {
            return head.next;
        }

        // Step 3: Calculate the position of the previous node.
        // Positions are calculated using 0-based indexing.
        int previousNodePosition = length - target - 1;

        // Step 4: Traverse to the node before the target node.
        Node<T> previous = head;

        while (previousNodePosition > 0) {
            previous = previous.next;
            previousNodePosition--;
        }

        // Step 5: Skip the target node by updating the next reference.
        previous.next = previous.next.next;

        return head;
    }

    /**
     * Prints all elements of a singly linked list.
     *
     * @param head the head node of the linked list
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

    /**
     * Creates and returns a sample singly linked list.
     *
     * <p>Linked list:</p>
     * <pre>
     * 24 -> 45 -> 34 -> 67 -> 54 -> 89 -> null
     * </pre>
     *
     * @return the head node of the linked list
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
}
