package java_hs;

import java.util.Scanner;

public class java_49 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] change = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int money = 0;
		
		System.out.println("돈을 입력하시오");
		money = sc.nextInt();
		
		for ( int i = 0; i < change.length; i++ ) {
			if( (money / change[i]) > 0 ) {
				System.out.println(change[i] + "원 " + money / change[i]);
				money %= change[i];
				
			}
		}
		
		
		

	}

}
