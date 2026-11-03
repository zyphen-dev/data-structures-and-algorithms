
package linkedlist.foundation;

import linkedlist.Node;

/**
 * Demonstrates how to calculate the sum of all node values
 * in a singly linked list.
 */
public class SumOfNodes {

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();

        int sum = sumOfNodes(head);

        System.out.println("Sum of all nodes: " + sum);
    }

    /**
     * Calculates the sum of the integer values stored in a linked list.
     *
     * Traverses the linked list from the head node to the last node,
     * adding the data of each node to the running sum.
     *
     * @param head the head node of the linked list
     * @return the sum of all node values, or 0 if the list is empty
     *
     * Time Complexity: O(n), where n is the number of nodes.
     * Space Complexity: O(1), as only a constant amount of extra
     *                   memory is used.
     */
    private static int sumOfNodes(Node<Integer> head) {
        int sum = 0;
        Node<Integer> current = head;

        while (current != null) {
            sum += current.data;
            current = current.next;
        }

        return sum;
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
