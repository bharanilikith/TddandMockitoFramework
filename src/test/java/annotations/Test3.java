package annotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test3 {
	@Test
	public void demo() {
		String sub="Java";
		String sub1="java";
		
		int numb1=10;
		int numb2=20;
		
		//assertEquals(sub,sub1);
		//assertFalse(numb1<numb2);
		//assertNotNull(sub);
		//assertNull(sub);
		//assertTrue(numb1<numb2);
		
		assertSame(sub,sub1);

		
	}

}
