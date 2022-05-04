package java_hs;

import java.util.Scanner;

class Circlese {
	
	public static double Circlese(int radius) {
		return (radius*radius)*Math.PI;
	}
	
	public String Circlectn(String YN) {
		return YN;
	}

	
}

public class java_39 {

	public static void main(String[] args) {
		
		Circlese A = new Circlese();
		Scanner sc = new Scanner(System.in);
		
		int radius;
			
		System.out.println("반지름을 입력하시오.");
		
		radius = sc.nextInt();
		
		System.out.println(A.Circlese(radius));
		
		
	}

}
