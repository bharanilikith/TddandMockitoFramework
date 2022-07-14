package mockito;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCalculator {
	Calculator c=null;
	CalculatorServies service=mock(CalculatorServies.class);
	@Before
	public void setup() {
		c=new Calculator(service);
	}
	
	@Test
	public void testadd() {
		when(service.perform(2,3)).thenReturn(10);
		assertEquals(10,c.perform(2,3));
	}

}
