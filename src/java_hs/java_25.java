package java_hs;

import java.util.Scanner;

public class java_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		printFactorial(a);
		
	}
	
	public static int printFactorial(int n) {

			if ( n == 1 ) 
				return 1;
			else 
				return n + printFactorial(n-1);
		
	}

}
