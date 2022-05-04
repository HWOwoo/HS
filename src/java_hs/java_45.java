package java_hs;

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

public class java_45 {

	public static void main(String[] args) {
		Ractangles[] arrRac = new Ractangles[3];
		
		arrRac[0] = new Ractangles(1, 2);
		arrRac[1] = new Ractangles(3, 5);
		arrRac[2] = new Ractangles(4, 6);
		
		double arrSum = 0;
		for ( int i = 0; i < arrRac.length; i++ ) {
			arrSum = arrSum + arrRac[i].getArea();
		}
		System.out.println(arrSum);
	}

}
