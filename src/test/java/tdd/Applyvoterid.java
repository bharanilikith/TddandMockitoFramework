package tdd;

public class Applyvoterid {
	
	public static int isageValid(int age) {
		
		if(age<18) {
			System.out.println("not eligible to cast vote");
		}
		else
		{
			System.out.println("is eligible to cast vote");
		}
		return age;
	}

}
