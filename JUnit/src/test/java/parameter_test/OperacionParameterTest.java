package parameter_test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Operacion.Operacion;

@RunWith(value = Parameterized.class )
public class OperacionParameterTest {

	 Operacion operacion;
	
	@Parameters 
	public static Iterable<Object[]> getData(){
		 
		
		
		return Arrays.asList(new Object[][]{ 
				{3, 1, 4}, 
				{3, 2, 5},
				{5, 1, 6}});
		
		/*List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[]{3,1,4});
		obj.add(new Object[]{3,2,5});
		obj.add(new Object[]{3,3,6});
		return obj;*/
	} 
	
	@Before
	public void setUp() {
		operacion = new Operacion();
	}
	
	
	private int a, b, exp;
	
	public OperacionParameterTest(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;		
	}
	
	
	@Test
	public void testSuma() {
		
		int result = operacion.suma(a, b);
		
		assertEquals(exp, result);
	}

}
