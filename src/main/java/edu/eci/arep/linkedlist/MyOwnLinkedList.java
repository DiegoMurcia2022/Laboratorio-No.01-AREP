package edu.eci.arep.linkedlist;

import edu.eci.arep.linkedlist.exception.LinkedListException;
import edu.eci.arep.linkedlist.node.Node;
import java.lang.String;

public class MyOwnLinkedList {
    private int counter;
    private Node head;

    public MyOwnLinkedList(){}

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

    public void add(Double data, int index) {
        Node temporal = new Node(data);
        Node current = head;

        if(current!=null) {
            for(int i=0;i<index && current.getNext()!=null;i++) {
                current = current.getNext();
            }
        }

        temporal.setNext(current.getNext());
        current.setNext(temporal);

        counter++;
    }

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

    public void remove(int index) throws LinkedListException {
        Node current;

        if(index<1 || index>counter) {
            throw new LinkedListException(LinkedListException.INDEX_OUT_OF_RANGE);
        }

        current = head;

        if(head!=null) {
            for(int i=0;i<index;i++) {
                if(current.getNext()==null) {
                    throw new LinkedListException(LinkedListException.INDEX_OUT_OF_RANGE);
                }

                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());

            counter--;
        } else {
            throw new LinkedListException(LinkedListException.INDEX_OUT_OF_RANGE);
        }
    }

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
