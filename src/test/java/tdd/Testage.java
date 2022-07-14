package tdd;

import java.util.Scanner;

import org.junit.Test;

public class Testage {
	@Test
	public void age() {
		//Applyvoterid a=new Applyvoterid();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int numb=s.nextInt();
		Applyvoterid.isageValid(numb);
	}

}
