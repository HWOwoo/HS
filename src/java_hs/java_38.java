package java_hs;

import java.util.Scanner;

class Rectangle {
	
	public static double Rectangle(double height, double width) {
		return height*width;
	}

}

public class java_38 {

	public static void main(String[] args) {
		Rectangle Ham = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로의 길이를 입력하세요");
		
		double height = sc.nextDouble();
		
		System.out.println("세로의 길이를 입력하세요");
		
		double width = sc.nextDouble();
		
		System.out.println(Ham.Rectangle(height, width));
		

	}
}
