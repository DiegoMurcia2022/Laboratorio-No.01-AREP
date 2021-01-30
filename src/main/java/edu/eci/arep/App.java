package edu.eci.arep;

import edu.eci.arep.linkedlist.MyOwnLinkedList;
import edu.eci.arep.linkedlist.exception.LinkedListException;

public class App {
    private MyOwnLinkedList linkedList;

    public App(){
        linkedList = new MyOwnLinkedList();

        addValues();
        banner();
        calculation();
    }

    private void banner() {
        System.out.println();
        System.out.println("###############    LABORATORIO No.01 - AREP     ###############");
        System.out.println("############### Diego Alejandro Murcia Cespedes ###############");
        System.out.println();
        System.out.println("The LinkedList is: "+linkedList.toString());
    }

    private void addValues() {
        linkedList.add(160.0);
        linkedList.add(591.0);
        linkedList.add(114.0);
        linkedList.add(229.0);
        linkedList.add(230.0);
        linkedList.add(270.0);
        linkedList.add(128.0);
        linkedList.add(1657.0);
        linkedList.add(624.0);
        linkedList.add(1503.0);
    }

    private void calculation() {
        try {
            System.out.println("The Mean is: "+Calculator.mean(linkedList));
            System.out.println("The Standard Deviation is: "+Calculator.standardDeviation(linkedList));
        } catch (LinkedListException e) {
            System.out.println();
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
