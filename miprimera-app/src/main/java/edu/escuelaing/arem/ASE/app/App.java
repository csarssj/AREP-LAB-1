package edu.escuelaing.arem.ASE.app;

import Calculator.Reader;
import LinkedList.LinkedList;

import java.io.File;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*LinkedList numbers = new LinkedList();
        Double num1 = new Double(1);
        Double num2 = new Double(2);
        Double num3 = new Double(3);
        numbers.append(num1);
        numbers.append(num2);
        numbers.append(num3);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers);*/
        Reader r = new Reader();
        File file = new File(args[0]);
        r.fileReader(file);



    }
}
