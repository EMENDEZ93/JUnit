package before_after;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperaciontTestBeforeAfter {

	OperacionBeforeAfter operacionBeforeAfter; 
	
	@Before
	public void before() {
		operacionBeforeAfter = new OperacionBeforeAfter();	
	}

	
	@Test
	public void test() {
	
		//arrange
		int a = 3;
		int b = 2;
		
		//act
		int resultado = operacionBeforeAfter.add(a, b);
		
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
