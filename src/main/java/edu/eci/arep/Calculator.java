package edu.eci.arep;

import edu.eci.arep.linkedlist.MyOwnLinkedList;
import edu.eci.arep.linkedlist.exception.LinkedListException;

import java.text.DecimalFormat;

public class Calculator {
    public static double mean(MyOwnLinkedList linkedList) throws LinkedListException {
        double summation = 0, dubleData = 5.1;
        Integer integerData = 5;
        Double value;
        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        for(int i=0;i<linkedList.size();i++) {
            value = linkedList.get(i);

            if(value!=null) {
                summation += linkedList.get(i);
            }
        }

        return Math.round((summation/linkedList.size())*100.0)/100.0;
    }

    public static double standardDeviation(MyOwnLinkedList linkedList) throws LinkedListException {
        double meanCalculation = mean(linkedList), summation = 0, value, desviationCalculation;

        for(int i=0;i<linkedList.size();i++) {
            value = linkedList.get(i)-meanCalculation;

            summation += Math.pow(value, 2);
        }

        desviationCalculation = Math.sqrt(summation/(linkedList.size()-1));

        return Math.round(desviationCalculation*100.0)/100.0;
    }
}
