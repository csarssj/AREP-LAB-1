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
            System.out.println(col1);
            System.out.println(col2);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
