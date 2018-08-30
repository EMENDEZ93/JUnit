package before_after;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Operacion.Operacion;

public class OperaciontTestBeforeAfter {

	Operacion operacion; 
	
	@Before
	public void before() {
		operacion = new Operacion();	
	}

	
	@Test
	public void test() {
	
		//arrange
		int a = 3;
		int b = 2;
		
		//act
		int resultado = operacion.suma(a, b);
		
		//assert
		assertEquals(5, resultado);
		System.out.println("-------- Unit Test ----------");
	}	
	
	
	@Before
	public void befores() {
		System.out.println("****** Before method  ********");
	}
	
	@After
	public void afters() {
		System.out.println("****** After method  ********");
	}	
	
}
