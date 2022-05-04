package java_hs;

import java.util.Scanner;

class Ractangles {
	private int width,height;
	
	public Ractangles(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return height * width;
	}
}

public class java_46 {

	public static void main(String[] args) {
		Ractangles[] arrRac = new Ractangles[3];
		
		arrRac[0] = new Ractangles(1, 2);
		arrRac[1] = new Ractangles(3, 5);
		arrRac[2] = new Ractangles(4, 6);
		
		double arrSum = 0;
		for ( int i = 0; i < arrRac.length; i++ ) {
			Scanner sc = new Scanner(System.in);
			
			int height = sc.nextInt();
			int width = sc.nextInt();
			
			arrRac[i] = new Ractangles(width, height);
			
			arrSum = arrSum + arrRac[i].getArea();
		}
		System.out.println(arrSum);
	}

}
