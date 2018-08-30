package expected_timeout;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Operacion.Operacion;

public class OperacionExpectedTimeout {

	Operacion operacion;
	
	@Before
	private void setUp(){
		operacion = new Operacion();
	}
	
	@Test(expected = ArithmeticException.class)
	public void test() {
		operacion.dividir(5, 0);
	}

	@Test(timeout = 1000 )
	public void testOperacionOptima() {
		operacion.metodoDuracionExcesiva();
	}	
	
}
