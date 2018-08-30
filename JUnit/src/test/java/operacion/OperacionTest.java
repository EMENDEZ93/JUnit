package operacion;

import static org.junit.Assert.*;

import org.junit.Test;

import Operacion.Operacion;

public class OperacionTest {

	@Test
	public void testSuma() {
		
		//Arrange
		int a = 3;
		int b = 2;
		
		//Act
		int resultado = Operacion.suma(a, b);
		
		//Assert
		assertEquals(5, resultado);
	}

}
