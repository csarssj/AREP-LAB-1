package Calculator;

import LinkedList.LinkedList;

import java.io.*;

/**
 *Clase para la lectura e imprmimir el calculo de la media y la desviación estandar
 *
 * @author Ceseg
 */
public class Reader {
    public Reader(){};
    public void fileReader(File file){
        Calculator cal = new Calculator();
        LinkedList col1 = new LinkedList();
        LinkedList col2 = new LinkedList();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = br.readLine())!=null) {
                String[] par = line.split(" ");
                Double first = Double.parseDouble(par[0]);
                Double second = Double.parseDouble(par[1]);
                col1.append(first);
                col2.append(second);
            }
            br.close();
            Double mean = cal.mean(col1);
            Double mean2 = cal.mean(col2);
            Double des = cal.desviationStandar(col1);
            Double des2 = cal.desviationStandar(col2);
            System.out.println("La media calculada es: "+String.format("%.2f",mean)+" con una desviacion de: "+String.format("%.2f",des));
            System.out.println("La media calculada es: "+String.format("%.2f",mean2)+" con una desviacion de: "+String.format("%.2f",des2));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
