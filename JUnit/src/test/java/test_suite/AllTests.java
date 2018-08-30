package test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import operacion.OperacionTest;
import parameter_test.OperacionParameterTest;

@RunWith(Suite.class)
@SuiteClasses({ OperacionParameterTest.class,
	OperacionTest.class})
public class AllTests {

}
