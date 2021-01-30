package edu.eci.arep.linkedlist;

import edu.eci.arep.linkedlist.exception.LinkedListException;
import edu.eci.arep.linkedlist.node.Node;
import java.lang.String;

public class MyOwnLinkedList {
    private int counter;
    private Node head;

    /**
     * Constructor de la clase Node
     */
    public MyOwnLinkedList(){}

    /**
     * Añade al final de la LinkedList un nuevo dato
     *
     * @param data Información a añadir que debe ser de tipo Double
     */
    public void add(Double data) {
        Node temporal, current;

        if(head==null) {
            head = new Node(data);
        }

        temporal = new Node(data);
        current = head;

        if(current!=null) {
            while(current.getNext()!=null) {
                current = current.getNext();
            }

            current.setNext(temporal);
        }

        counter++;
    }

    /**
     * Obtiene el dato de la posición que se desee
     *
     * @param index Posición en la LinkedList
     * @return Valor que se encuentra en la posición ingresada de la LinkedList y es de tipo Double
     * @throws LinkedListException Envia un error en caso tal de que la posición ingresada sea mayor o menor al tamaño de la LinkedList
     */
    public Double get(int index) throws LinkedListException{
        Node current;

        if(index<0) {
            throw new LinkedListException(LinkedListException.INDEX_OUT_OF_RANGE);
        }

        current = null;

        if(head!=null) {
            current = head.getNext();

            for(int i=0;i<index;i++) {
                if(current.getNext()==null) {
                    throw new LinkedListException(LinkedListException.INDEX_OUT_OF_RANGE);
                }

                current = current.getNext();
            }

            return (Double) current.getData();
        }

        return null;
    }

    /**
     * Da formato a la LinkedList
     *
     * @return Formato entendible para mostrar la LinkedList y es de tipo String
     */
    public String toString() {
        StringBuilder output = new StringBuilder();
        Node current = head.getNext();

        if(head!=null) {
            while(current!=null) {
                output.append("[").append(current.getData().toString()).append("]");

                current = current.getNext();
            }
        }

        return output.toString();
    }

    public int size() {
        return counter;
    }
}
