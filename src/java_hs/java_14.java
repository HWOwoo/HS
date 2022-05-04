package java_hs;

public class java_14 {

	public static void main(String[] args) {
//		 " 아래를 프로그래밍 하시오.
//		  - 1과 1000 사이의 숫자중 3의 배수 이자 5의 배수인 첫번재 수는?
//				  -  없다면 없다고 출력 할것."
		
		boolean search = false;
		
		for ( int i = 1; i <= 1000; i++ ) {
			if ( i % 3 == 0 && i % 5 == 0 ) {
				search = true;
				System.out.println(i);
				break;
			}
			
		}
		
		
		if ( search ) {
			System.out.println("이와 같은 수를 찾았습니다.");
		} else {
			System.out.println("수를 찾지 못했습니다.");
		}
	}

}
