package java_hs;

public class java_15 {

	public static void main(String[] args) {
		
		for( int i = 1; i <= 9; i++) {
			for ( int j = 1; j <= 9; j++ ) {
				if ( i % 3 == 0 ) {
				System.out.println(i+" * " + j +" = " + i*j);
				}
			}
		}
	}

}
