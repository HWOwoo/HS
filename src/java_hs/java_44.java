package java_hs;
class Cirlce {
	private double radian;
	
	public Cirlce ( double radian ) {
		this.radian = radian;
		
	}
	
	public double getArea () {
		return radian * radian * Math.PI;
	}
	
}

public class java_44 {

	public static void main(String[] args) {
		Cirlce[] hamCircle = new Cirlce[3];
		
		hamCircle[0] = new Cirlce(10);
		hamCircle[1] = new Cirlce(3);
		hamCircle[2] = new Cirlce(4);
		
		double arrSum = 0;
		for ( int i = 0; i < hamCircle.length; i++) {
			arrSum = arrSum + hamCircle[i].getArea();
		}
		
		
	}

}
