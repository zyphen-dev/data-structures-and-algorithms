package linkedlist.mediumlevel;

import linkedlist.Node;

import java.util.Stack;

/**
 * Demonstrates how to reverse a singly linked list using both an auxiliary
 * {@link Stack} and an optimal in-place iterative pointer approach.
 *
 * <p><b>Complexity Analysis:</b></p>
 * <ul>
 *   <li><b>Stack Approach:</b> Time Complexity: O(n), Space Complexity: O(n)</li>
 *   <li><b>Iterative In-Place Approach:</b> Time Complexity: O(n), Space Complexity: O(1)</li>
 * </ul>
 */
public class ReverseALinkedList {

    /**
     * Entry point of the application. Creates a sample linked list,
     * prints its original order, reverses it, and prints the reversed list.
     */
    static void main() {
        Node<Integer> head = createLinkedList();
        printLinkedList(head);
//        Node<Integer> result = reverseLinkedListUsingStack(head);
        Node<Integer> result = reserveLinkedList(head);
        printLinkedList(result);
    }

    /**
     * Reverses a singly linked list by pushing all nodes onto a stack
     * and popping them in LIFO (Last-In, First-Out) order to rebuild the links.
     *
     * <p><b>Complexity Analysis:</b></p>
     * <ul>
     *   <li><b>Time Complexity:</b> O(n) — each node is pushed onto and popped from the stack once.</li>
     *   <li><b>Space Complexity:</b> O(n) — requires auxiliary stack space proportional to the number of nodes.</li>
     * </ul>
     *
     * @param head the head node of the singly linked list to reverse
     * @param <T>  the type of data stored in the nodes
     * @return the new head node of the reversed linked list, or {@code null} if the list is empty
     */
    private static <T> Node<T> reverseLinkedListUsingStack(Node<T> head) {
        if (head == null) {
            return null;
        }

        Node<T> temp = head;
        Stack<Node<T>> stack = new Stack<>();

        // Push all nodes onto the stack
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        // Pop the last node to act as the new head
        Node<T> newHead = stack.pop();
        Node<T> curr = newHead;

        // Reconnect remaining nodes in reverse order
        while (!stack.empty()) {
            curr.next = stack.pop();
            curr = curr.next;
        }

        // Terminate the list to prevent a cycle with the original head's next pointer
        curr.next = null;
        return newHead;
    }

    /**
     * Reverses a singly linked list in place using an iterative three-pointer approach.
     *
     * <p>Iterates through the list while redirecting each node's {@code next} reference
     * to point to its preceding node, without allocating additional data structures.</p>
     *
     * <p><b>Complexity Analysis:</b></p>
     * <ul>
     *   <li><b>Time Complexity:</b> O(n) — traverses the linked list of {@code n} nodes once.</li>
     *   <li><b>Space Complexity:</b> O(1) — reverses the list in place using a constant number of pointers.</li>
     * </ul>
     *
     * @param head the head node of the singly linked list to reverse
     * @param <T>  the type of data stored in the nodes
     * @return the new head node of the reversed linked list (originally the tail),
     *         or {@code null} if the list is empty
     */
    private static <T> Node<T> reserveLinkedList(Node<T> head) {
        Node<T> prev = null;
        Node<T> temp = head;
        Node<T> front = null;

        while (temp != null) {
            // Save the next node before overwriting temp.next
            front = temp.next;

            // Reverse the current node's pointer to point to the previous node
            temp.next = prev;

            // Advance pointers one position forward
            prev = temp;
            temp = front;
        }

        // prev now points to the new head of the reversed list
        return prev;
    }

    /**
     * Creates and returns a sample singly linked list.
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
     * Prints all elements of a singly linked list sequentially, ending with {@code null}.
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
}