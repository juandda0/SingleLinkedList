package org.juannn.models;

public class Node {

    private Object element;
    private Node next;

    public Node(Object element) {
        this.element = element;
        next = null;
    }

    public Object getElement() {
        return element;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
