package RGR;

/**
 *
 * @author ricardo
 */
import junit.framework.*;

/**
 * Un test de ejemplo sobre la clase String.
 */
public class TestNumero extends TestCase {
//estos son tus test, aserciones en true
    
    public void testNumero() {
        int numero = 5;
        
        assertTrue(repeticiones(5)== 3 );
    }

    public void testConcat1() {
        String s = "Yo soy: ";
        String s2 = s.concat("Juan Perez");
        assertTrue(s2.equals("Yo soy: Juan Perez"));
    } // testConcat1

    public void testConcat2() {
        String s = "Yo soy: ";
        String s2 = s.concat("Codigo de prueba");
        assertTrue(s2.equals("Yo soy: Codigo de prueba"));
    } // testConcat2
    
//esto va siempre

    public static Test suite() {
        return new TestSuite(TestNumero.class);
    } // suite

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    } // main
} // class

