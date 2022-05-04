package java_hs;

class Quadrangle {
	double width;
	double height;
	
	void quadrangleInfo( double width, double height ) {
		this.width = width;
		this.height = height;
	}
	
	double quadrangleArea() {
		return width*height;
	}
	
}

public class java_29 {

	public static void main(String[] args) {
		
		Quadrangle quadrangle = new Quadrangle();
		
		quadrangle.quadrangleInfo(5, 4);
		
		System.out.println(quadrangle.quadrangleArea());

	}

}