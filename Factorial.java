package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int fact=1;
		for (int j = 1; j <= num; j++) {
				
			fact = fact * j;
						
		}
		System.out.println(fact);
	}

}
