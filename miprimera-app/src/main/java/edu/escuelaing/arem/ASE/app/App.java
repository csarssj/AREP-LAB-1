package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.calculator.Reader;
import edu.escuelaing.arem.ASE.app.linkedList.LinkedList;

import java.io.File;
/**
 * Programa encargado de calcular la media y la varianza, leyendo una lista ( linkedList) pasada como parametro
 *
 * @author Ceseg
 */
public class App 
{
    public static void main( String[] args )
    {
        Reader r = new Reader();
        File file = new File(args[0]);
        r.fileReader(file);
    }
}
