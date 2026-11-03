package linkedlist;

/**
 * Demonstrates finding the middle node of a singly linked list.
 *
 * For an even number of nodes (e.g., 4 nodes: 24 -> 45 -> 34 -> 67),
 * both methods return the second middle node (34).
 */
public class FindMiddleNode {

    static void main() {
        Node<Integer> head = createLinkedList();

        System.out.println("Middle using Brute Force: " + bruteForceToFindMiddleNode(head).data);
        System.out.println("Middle using Two Pointer : " + twoPointerTechnique(head).data);
    }

    /**
     * Finds the middle node using the Tortoise and Hare (Slow & Fast Pointer) approach.
     *
     * How it works:
     * - 'slow' moves 1 node at a time.
     * - 'fast' moves 2 nodes at a time.
     * - When 'fast' reaches the end (null or fast.next == null), 'slow' is at the middle.
     *
     * Time Complexity : O(n) - Single pass
     * Space Complexity: O(1)
     *
     * @param head head of the linked list
     * @param <T>  type of data held by the node
     * @return the middle node
     */
    private static <T> Node<T> twoPointerTechnique(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    /**
     * Finds the middle node using the two-pass brute force approach.
     *
     * Steps:
     * 1. Calculate the total length of the list by traversing to the end.
     * 2. Compute middle index = length / 2.
     * 3. Traverse from head to that index.
     *
     * Time Complexity : O(n) + O(n/2) = O(n)
     * Space Complexity: O(1)
     *
     * @param head head of the linked list
     * @param <T>  type of data held by the node
     * @return the middle node
     */
    private static <T> Node<T> bruteForceToFindMiddleNode(Node<T> head) {
        Node<T> curr = head;
        int length = 0;

        // Step 1: Calculate total length
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        System.out.println("Length of the LinkedList is: " + length);

        // Step 2 & 3: Move pointer to length / 2
        int middleSteps = length / 2;
        Node<T> result = head;
        while (middleSteps > 0) {
            result = result.next;
            middleSteps--;
        }

        return result;
    }

    /**
     * Creates and returns a sample singly linked list.
     *
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
}
