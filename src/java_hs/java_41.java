package java_hs;

import java.util.Scanner;

public class java_41 {

	public static void main(String[] args) {
		
//		Circlese A = new Circlese();
//		Scanner sc = new Scanner(System.in);
//		
//		int radius;
//			
//		System.out.println("반지름을 입력하시오.");
//		
//		radius = sc.nextInt();
//		
//		System.out.println("넓이는 " + A.Circlese(radius));
//		System.out.println("계속 하시겠습니까? Y / N");
//		
//		String ctn = sc.next();
		
		while ( true) {
			
			Circlese A = new Circlese();
			Scanner sc = new Scanner(System.in);
			
			int radius;
				
			System.out.println("반지름을 입력하시오.");
			
			radius = sc.nextInt();
			
			System.out.println("넓이는 " + A.Circlese(radius));
			System.out.println("계속 하시겠습니까? Y / N");
			
			String ctn = sc.next();
//			System.out.println("반지름을 입력하시오.");
//			
//			radius = sc.nextInt();
//			
//			System.out.println("넓이는 " + A.Circlese(radius));
//			System.out.println("계속 하시겠습니까? Y / N");
//			
//			String ctn1 = sc.next();	
			
			if ( ctn.equalsIgnoreCase("Y")) {
				continue;
			} else if ( ctn.equalsIgnoreCase("N")) {
				break;
			}
		} 
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
		
	}

}