package edu.eci.arep.linkedlist.node;

public class Node {
    Node next;
    Object data;

    /**
     * Constructor de la clase Node
     *
     * @param data Recibe los datos para crear un nodo con el tipo de dato ingresado
     */
    public Node(Object data) {
        this.data = data;
        next = null;
    }

    /**
     * Constructor de la clase Node
     *
     * @param data Información con la que se se configurara el nodo
     * @param next Siguiente nodo a configurar con información
     */
    public Node (Object data, Node next) {
        this.next = next;
        this.data = data;
    }

    /**
     *
     * @return El siguiente nodo al que sigue segun en el que se este ubicado
     */
    public Node getNext() {
        return next;
    }

    /**
     * Configura el siguiente nodo
     *
     * @param next Nodo siguiente al nodo actual
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     *
     * @return Información que contiene el nodo
     */
    public Object getData() {
        return data;
    }
}
