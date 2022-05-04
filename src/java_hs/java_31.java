package java_hs;

class NumSum {
	
	int getSum(int num) {
		int sum=0;
		for(int i=0; i<=num; i++) {
			sum = sum + i;
		}
		
	
	return sum;
	}
	
}

public class java_31 {

	public static void main(String[] args) {


		NumSum numSum = new NumSum();
		
		System.out.println(numSum.getSum(10));
	}

}
