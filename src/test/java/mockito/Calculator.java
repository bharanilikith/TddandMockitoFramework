package mockito;

public class Calculator {
	CalculatorServies service;
	
	public Calculator(CalculatorServies service) {
		this.service=service;
		
	}
	
	public int perform(int i,int j) {
		return service.perform(i, j);
		
	}
	

}
