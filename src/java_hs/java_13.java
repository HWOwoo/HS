package java_hs;

public class java_13 {

	public static void main(String[] args) {
//		int a = 90, b = 70, c = 100;
//		
//		if ( b < a && c < a ) {
//			System.out.println("a가 제일 크다.");
//		} else if ( a < b && c < b ) {
//			System.out.println("b가 제일 크다.");
//		} else if ( a < c && b < c) {
//			System.out.println("c가 제일 크다.");
//		}
		
//		int num = 0;
//		
//		for ( int i = 1; i <= 100; i++ ) {
//			if ( i % 2 == 0 ) {
//				num = num+i;
//			}
//		}
//		System.out.println(num);
		
		int a = 80; int b = 80; int c = 60;
		int total = a + b + c;
		double avg = (a + b + c)/3;
	
		System.out.println("총점은 "+total+ "이고 평균은 "+avg+"입니다.");
		
		if ( avg >= 90) {
			System.out.println("수");
		}	else if ( avg >= 80 ) {
			System.out.println("우");
		}	else if ( avg >= 70 ) {
			System.out.println("미");
		}	else if ( avg >= 60 ) {
			System.out.println("양");	
		}	else if ( avg >= 50 ) {
			System.out.println("가");
		}	

	}
	
}
