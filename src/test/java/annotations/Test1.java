package annotations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Test1 {
	@Before
	public void before() {
		System.out.println("using @Before annotation,executed before each and every testcase");
		
	}
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("using @Beforeclass, executed before all testcase");
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("using @Afterclass, executed after all testcases");
	}

	
	@After
	public void after() {
		System.out.println("using @After , executed after each testcases");
	}
	
	@Test
	public void test() {
		System.out.println("Test Method");
	}
	
	@Ignore
	public void dummy() {
		System.out.println("dummy method");
	}
}
