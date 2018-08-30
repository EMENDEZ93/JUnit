package beforeclass_afterclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperacionBeforeClassAfterClass {

	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("*********** @BeforeClass *************");
	}

	@Before
	public void testBefore() {
		System.out.println("*********** @Before *************");
	}
	
	@Test
	public void testTest() {
		System.out.println("*********** @Test 1 *************");
	}
	
	@After
	public void testAfter() {
		System.out.println("*********** @After *************");
	}

	
	@Test
	public void testTest2() {
		System.out.println("*********** @Test 2 *************");
	}	
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("*********** @AfterClass *************");
	}
	
}
