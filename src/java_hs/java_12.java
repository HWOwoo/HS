package java_hs;

public class java_12 {

	public static void main(String[] args) {
		
		int num = 0;
		
		for(int i = 1; i < 100; i++) {
			if (i%2 == 0) {
				num = i + num;
			} else {
				continue;
			}
		}
		System.out.println(num);
	}
	

}
