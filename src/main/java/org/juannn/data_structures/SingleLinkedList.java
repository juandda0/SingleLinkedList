package org.juannn.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<T> implements Iterable<T> {

    private org.juannn.data_structures.Node<T> head;
    private Node<T> tail;

    public SingleLinkedList() {
        head = null;
        tail = null;
    }

    // Add a new element to the end of the list
    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode); // Add the new element after the current tail
            tail = newNode; // Update the tail to point to the new node
        }
    }

    // Add a new element to the beginning of the list
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNextNode(head); // Set the new node's next to the current head
            head = newNode; // Update the head to the new node
        }
    }

    // Get the first node in the list
    public Node<T> getFirst() {
        return head;
    }

    // Get the last node in the list
    public Node<T> getLast() {
        return tail;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Print all elements in the list from head to tail
    public void printForward() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNextNode();
        }
    }

    // Remove the first element from the list
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T element = head.getElement();
        head = head.getNextNode();
        if (head == null) {
            tail = null; // If the list becomes empty, update tail as well
        }
        return element;
    }

    // Remove the last element from the list
    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T element = tail.getElement();
        if (head == tail) { // Only one element in the list
            head = null;
            tail = null;
        } else {
            Node<T> current = head;
            while (current.getNextNode() != tail) {
                current = current.getNextNode(); // Traverse to the second-to-last node
            }
            current.setNextNode(null); // Remove the link to the last node
            tail = current; // Update the tail to the new last node
        }
        return element;
    }

    // Iterator implementation for the list
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T element = current.getElement();
                current = current.getNextNode();
                return element;
            }
        };
    }
}
