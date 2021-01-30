package edu.eci.arep.linkedlist.exception;

public class LinkedListException extends Exception {
    public static final String INDEX_OUT_OF_RANGE = "Index out of range.";
    public static final String WRONG_DATA_TYPE = "Wrong data type. It must be Double or Integer";

    public LinkedListException(String message) {
        super(message);
    }
}
