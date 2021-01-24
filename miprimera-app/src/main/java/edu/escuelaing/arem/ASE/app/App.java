package edu.escuelaing.arem.ASE.app;

import LinkedList.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList numbers = new LinkedList();
        Double num1 = new Double(1);
        Double num2 = new Double(2);
        Double num3 = new Double(3);
        numbers.append(num1);
        numbers.append(num2);
        numbers.append(num3);
       // Double res = numbers.get(1);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println( numbers);
        System.out.println( numbers.toString());
        //System.out.println( numbers.toString());
        //System.out.println( numbers.toString());
    }
}
