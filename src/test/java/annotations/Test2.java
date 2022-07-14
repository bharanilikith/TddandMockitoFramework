package annotations;

import org.junit.Ignore;
import org.junit.Test;

public class Test2 {
	
	@Test
	public void calls() {
		System.out.println("calls");
	}
	
	@Ignore
	public void setting() {
		System.out.println("settings");
	}

}
