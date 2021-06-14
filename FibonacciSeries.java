package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstnum=0, secnum=1, sum;
		int range = 6;
		System.out.print(firstnum+", ");
			for (int i = 0; i < range; i++) {
			sum= firstnum+secnum;
			System.out.print(sum+", ");
			firstnum = secnum;
			secnum = sum;
			
		}
			
		}
	}


