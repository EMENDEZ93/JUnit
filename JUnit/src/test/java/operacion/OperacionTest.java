package operacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Operacion.Operacion;

public class OperacionTest {

	Operacion operacion; 
	
	@Before
	public void before() {
		operacion = new Operacion();	
	}	
	
	@Test
	public void testSuma() {
		
		//Arrange
		int a = 3;
		int b = 2;
		
		//Act
		int resultado = operacion.suma(a, b);
		
		//Assert
		assertEquals(5, resultado);
	}

}
