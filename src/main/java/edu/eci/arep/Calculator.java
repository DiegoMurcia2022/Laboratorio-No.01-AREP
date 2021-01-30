package edu.eci.arep;

import edu.eci.arep.linkedlist.MyOwnLinkedList;
import edu.eci.arep.linkedlist.exception.LinkedListException;

import java.text.DecimalFormat;

public class Calculator {
    /**
     * Metodo que calcula la media estadistica
     *
     * @param linkedList LinkedList que contiene los datos para calcular el valor de la media
     * @return Dato de tipo Double representando el resultado de la media
     * @throws LinkedListException Propaga un error en caso tal de que se exceda la posiciones maximas de la LinkedList
     */
    public static double mean(MyOwnLinkedList linkedList) throws LinkedListException {
        double summation = 0;
        Double value;

        for(int i=0;i<linkedList.size();i++) {
            value = linkedList.get(i);

            if(value!=null) {
                summation += linkedList.get(i);
            }
        }

        return Math.round((summation/linkedList.size())*100.0)/100.0;
    }

    /**
     * Calcula la desviación estandar
     *
     * @param linkedList LinkedList que contiene todos los datos para calcular la desviacion estandar
     * @return Un dato de tipo Double que representa el resultado de calcular la desviación estandar
     * @throws LinkedListException En caso tal de ingresar una posición mayo o menor al tamaño de la LinkedList
     */
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
