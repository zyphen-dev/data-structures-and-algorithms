package linkedlist.foundation;

import linkedlist.Node;

public class CountNodes {
    static void main() {
        // List 1: 100 -> 200 -> 300 -> 400 -> null
        Node<Integer> head = new Node<>(100);
        head.next = new Node<>(200);
        head.next.next = new Node<>(300);
        head.next.next.next = new Node<>(400);

        // List 2: Empty list
        Node<Integer> emptyHead = null;

        System.out.println("Iterative Count (4 nodes) : " + countNodesIteratively(head));
        System.out.println("Iterative Count (Empty)   : " + countNodesIteratively(emptyHead));
    }

    // Approach 1: Iterative (Best Practice - O(n) Time, O(1) Space)
    private static <T> int countNodesIteratively(Node<T> head) {
        int nodeCount = 0;
        Node<T> curr = head;

        // If head is null, loop won't execute and it naturally returns 0
        while (curr != null) {
            nodeCount++;
            curr = curr.next;
        }

        return nodeCount;
    }
}
