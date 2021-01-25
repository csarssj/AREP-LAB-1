package edu.escuelaing.arem.ASE.app;

import Calculator.Reader;
import LinkedList.LinkedList;

import java.io.File;
/**
 *
 *
 * @author Ceseg
 */
public class App 
{
    public static void main( String[] args )
    {
        Reader r = new Reader();
        //File file = new File(args[0]);
        File file = new File("numeros.txt");
        r.fileReader(file);
    }
}
