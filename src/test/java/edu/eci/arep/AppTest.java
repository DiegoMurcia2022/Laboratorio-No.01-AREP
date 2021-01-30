package edu.eci.arep;

import edu.eci.arep.linkedlist.MyOwnLinkedList;
import edu.eci.arep.linkedlist.exception.LinkedListException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class AppTest  {
    @Test
    public void documentExampleMean01() {
        MyOwnLinkedList linkedList = new MyOwnLinkedList();
        double value = 550.6;

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

        try {
            Assert.assertEquals(Calculator.mean(linkedList), value, 0.0);
        } catch (LinkedListException e) {
            fail();
        }
    }

    @Test
    public void documentExampleStandardDeviation01() {
        MyOwnLinkedList linkedList = new MyOwnLinkedList();
        double value = 572.03;

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

        try {
            Assert.assertEquals(Calculator.standardDeviation(linkedList), value, 0.0);
        } catch (LinkedListException e) {
            fail();
        }
    }

    @Test
    public void documentExampleMean02() {
        MyOwnLinkedList linkedList = new MyOwnLinkedList();
        double value = 60.32;

        linkedList.add(15.0);
        linkedList.add(69.9);
        linkedList.add(6.5);
        linkedList.add(22.4);
        linkedList.add(28.4);
        linkedList.add(65.9);
        linkedList.add(19.4);
        linkedList.add(198.7);
        linkedList.add(38.8);
        linkedList.add(138.2);

        try {
            Assert.assertEquals(Calculator.mean(linkedList), value, 0.0);
        } catch (LinkedListException e) {
            fail();
        }
    }

    @Test
    public void documentExampleStandardDeviation02() {
        MyOwnLinkedList linkedList = new MyOwnLinkedList();
        double value = 62.26;

        linkedList.add(15.0);
        linkedList.add(69.9);
        linkedList.add(6.5);
        linkedList.add(22.4);
        linkedList.add(28.4);
        linkedList.add(65.9);
        linkedList.add(19.4);
        linkedList.add(198.7);
        linkedList.add(38.8);
        linkedList.add(138.2);

        try {
            Assert.assertEquals(Calculator.standardDeviation(linkedList), value, 0.0);
        } catch (LinkedListException e) {
            fail();
        }
    }
}
