package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import edu.escuelaing.arem.ASE.app.calculator.Reader;

public class calculatorTest {

	 @Test
	    public void deberiaCalcularMedia1() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test.txt");
	        a.fileReader(file);
	        assertEquals(a.getMean(),new Double(550.6));
	    }

	    @Test
	    public void deberiaCalcularMedia2() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test.txt");
	        a.fileReader(file);
	        assertEquals(a.getMean2(),new Double(60.32000000000001));
	    }
	    @Test
	    public void deberiaCalcularMedia3() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test2.txt");
	        a.fileReader(file);
	        assertEquals(a.getMean(),new Double(1328.60));
	    }

	    @Test
	    public void deberiaCalcularMedia4() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test2.txt");
	        a.fileReader(file);
	        assertEquals(a.getMean2(),new Double(54.92));
	    }
	    @Test
	    public void deberiaFallarCalcularMedia1() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test.txt");
	        a.fileReader(file);
	        assertFalse(a.getMean()==new Double(550.7));
	    }

	    @Test
	    public void deberiaFallarCalcularMedia2() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test.txt");
	        a.fileReader(file);
	        assertFalse(a.getMean2()==new Double(60.32000000000002));
	    }
	    @Test
	    public void deberiaFallarCalcularMedia3() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test2.txt");
	        a.fileReader(file);
	        assertFalse(a.getMean2()==new Double(60.32000000000002));
	    }
	    @Test
	    public void deberiaFallarCalcularMedia4() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test2.txt");
	        a.fileReader(file);
	        assertFalse(a.getMean2()==new Double(60.32000000000002));
	    }
	    @Test
	    public void deberiaCalcularDesviacion1() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test.txt");
	        a.fileReader(file);
	        assertEquals(a.getDes(),new Double(572.026844746915));
	    }

	    @Test
	    public void deberiaCalcularDesviacion2() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test.txt");
	        a.fileReader(file);
	        assertEquals(a.getDes2(),new Double(62.25583060601187));
	    }
	    @Test
	    public void deberiaCalcularDesviacion3() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test2.txt");
	        a.fileReader(file);
	        assertEquals(a.getDes(),new Double(27.46391571984349));
	    }
	    @Test
	    public void deberiaCalcularDesviacion4() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test2.txt");
	        a.fileReader(file);
	        assertEquals(a.getDes2(),new Double(63.154181703721456));
	    }
	    @Test
	    public void deberiaFallarCalcularDesviacion1() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test.txt");
	        a.fileReader(file);
	        assertFalse(a.getDes()==new Double(572.026844746915));
	    }

	    @Test
	    public void deberiaFallarCalcularDesviacion2() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test.txt");
	        a.fileReader(file);
	        assertFalse(a.getDes2()==new Double(62.25583060601187));
	    }
	    @Test
	    public void deberiaFallarCalcularDesviacion3() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test2.txt");
	        a.fileReader(file);
	        assertFalse(a.getDes2()==new Double(63.15));
	    }
	    @Test
	    public void deberiaFallarCalcularDesviacion4() throws Exception {
	        Reader a = new Reader();
	        File file = new File("src/test/java/edu/escuelaing/arem/ASE/app/test2.txt");
	        a.fileReader(file);
	        assertFalse(a.getDes2()==new Double(27.46));
	    }
}
