
package linkedlist.foundation;

import linkedlist.Node;

/**
 * Demonstrates how to search for an element in a singly linked list.
 * <p>
 * Supports two operations:
 * 1. Check whether an element exists.
 * 2. Find the index of an element.
 * <p>
 * Indexing starts at 0.
 */
public class SearchAnElement {

    static void main(String[] args) {
        Node<Integer> head = createLinkedList();

        System.out.println("Element exists: " + contains(head, 34));
        System.out.println("Element index: " + indexOf(head, 34));
        System.out.println("Missing element index: " + indexOf(head, 69));
    }

    /**
     * Creates a sample linked list:
     * <p>
     * 24 -> 45 -> 34 -> 67 -> null
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
     * Checks whether the target element exists in the linked list.
     *
     * @param head   the first node of the linked list
     * @param target the element to search for
     * @param <T>    the type of elements stored in the linked list
     * @return true if the element exists, otherwise false
     */
    public static <T> boolean contains(Node<T> head, T target) {
        return indexOf(head, target) != -1;
    }

    /**
     * Finds the index of the first occurrence of the target element.
     * <p>
     * Traverses the linked list from the head and compares each node's
     * data with the target using Objects.equals().
     *
     * @param head   the first node of the linked list
     * @param target the element to search for
     * @param <T>    the type of elements stored in the linked list
     * @return the zero-based index if found, otherwise -1
     */
    public static <T> int indexOf(Node<T> head, T target) {
        Node<T> current = head;
        int index = 0;

        while (current != null) {
            if (target.equals(current.data)) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }
}
