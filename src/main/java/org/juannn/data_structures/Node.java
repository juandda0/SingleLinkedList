package org.juannn.data_structures;

public class Node<T> {

    private T element;
    private Node<T> nextNode;
    private Node prevNode;

    public Node(T element) {
        this.element = element;
        nextNode = null;
        prevNode = null;
    }

    public T getElement(){
        return element;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }
}
