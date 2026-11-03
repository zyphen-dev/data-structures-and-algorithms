package linkedlist.foundation;

import linkedlist.Node;

/**
 * Topic: Linked List Traversal Approaches
 * <p>
 * Key Concept:
 * Traversal means visiting every node in the linked list starting from 'head'
 * until we hit 'null' (the end of the list).
 */
public class TraverseLinkedList {

    static void main() {
        // ==========================================
        // EXAMPLE 1: Integer Linked List
        // Visual: [10] -> [20] -> [30] -> [40] -> null
        // ==========================================
        Node<Integer> intHead = new Node<>(10);
        intHead.next = new Node<>(20);
        intHead.next.next = new Node<>(30);
        intHead.next.next.next = new Node<>(40);

        System.out.println("=== 1. Integer Linked List ===");

        System.out.print("Manual Approach    : ");
        traverseManually(intHead);

        System.out.print("Iterative (While)  : ");
        traverseIteratively(intHead);

        System.out.println(); // Blank line for spacing

        // ==========================================
        // EXAMPLE 2: String Linked List
        // Visual: ["Data"] -> ["Structure"] -> ["and"] -> ["Algorithms"] -> null
        // ==========================================
        Node<String> strHead = new Node<>("Data");
        strHead.next = new Node<>("Structure");
        strHead.next.next = new Node<>("and");
        strHead.next.next.next = new Node<>("Algorithms");

        System.out.println("=== 2. String Linked List ===");

        System.out.print("Manual Approach    : ");
        traverseManually(strHead);

        System.out.print("Iterative (While)  : ");
        traverseIteratively(strHead);
    }

    // -------------------------------------------------------------------------
    // APPROACH 1: Manual Traversal (For intuition only)
    // -------------------------------------------------------------------------
    // How it works : Explicitly chains .next calls to reach each node.
    // Limitation   : Hardcoded for exactly 4 nodes.
    //                - Fewer than 4 nodes -> crashes with NullPointerException.
    //                - More than 4 nodes  -> ignores the remaining nodes.
    private static <T> void traverseManually(Node<T> head) {
        System.out.print(head.data + " -> ");
        System.out.print(head.next.data + " -> ");
        System.out.print(head.next.next.data + " -> ");
        System.out.print(head.next.next.next.data + " -> null");
        System.out.println();
    }

    // -------------------------------------------------------------------------
    // APPROACH 2: Iterative Traversal using a While Loop (Best Practice)
    // -------------------------------------------------------------------------
    // How it works : Uses a temporary pointer 'curr' that steps forward (curr = curr.next)
    //                until it reaches 'null'.
    // Why use curr?: So we don't accidentally lose track of where 'head' is.
    // Complexity   : Time: O(n) | Space: O(1) (No extra memory used)
    private static <T> void traverseIteratively(Node<T> head) {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next; // Move pointer to the next node
        }
        System.out.println("null");
    }
}

