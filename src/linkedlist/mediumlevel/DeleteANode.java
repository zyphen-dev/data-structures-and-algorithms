package linkedlist.mediumlevel;

import linkedlist.Node;

/**
 * Demonstrates deleting a node at a specific 1-based position in a singly linked list.
 */
public class DeleteANode {

    /**
     * Entry point of the application. Creates a sample linked list, prints it,
     * attempts to delete a node at a specified position, and prints the resulting list.
     */
    static void main() {
        Node<Integer> head = createLinkedList();
        printLinkedList(head);
        Node<Integer> result = deleteNode(7, head);
        printLinkedList(result);
    }

    /**
     * Deletes the node at the specified 1-based position in a singly linked list.
     *
     * <p>If {@code head} is {@code null}, returns {@code null}. If {@code position} is
     * less than 1, the list is returned unchanged.</p>
     *
     * @param position the 1-based index of the node to remove
     * @param head     the head node of the singly linked list
     * @param <T>      the type of data stored in the nodes
     * @return the head node of the modified linked list, or {@code null} if the list was empty
     *         or the only node was removed
     * @throws IndexOutOfBoundsException if {@code position} is greater than the number of nodes in the list
     */
    private static <T> Node<T> deleteNode(int position, Node<T> head) {

        if (head == null) {
            return null;
        }

        if (position == 1) {
            return head.next;
        } else if (position < 1) {
            return head;
        }

        Node<T> curr = head;
        for (int i = 1; i < position - 1; i++) {
            if (curr.next == null) {
                throw new IndexOutOfBoundsException("Node at position " + position + " doesn't exist");
            }
            curr = curr.next;
        }

        if (curr.next == null) {
            throw new IndexOutOfBoundsException("Node at position " + position + " doesn't exist");
        }
        curr.next = curr.next.next;

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
