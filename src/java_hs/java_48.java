package java_hs;

public class java_48 {

	public static void main(String[] args) {
		
		int[] arrLotto = new int[6];
		
		for ( int i = 0; i < arrLotto.length; i++ ) {
			arrLotto[i] = (int)(Math.random() * 45) + 1;
			
			//중복 제거 로직
			for ( int j = 0; j < i; j++ ) {
				if( arrLotto[i] == arrLotto[j] ) {
					i--;
					break;
				}
			}						
		}
		for ( int i = 0; i < arrLotto.length; i++ ) {
			System.out.println(arrLotto[i]);
		}
	}

}
