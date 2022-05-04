package java_hs;

class Shape {
	
	
}

public class java_58 {

	public static void main(String[] args) {
		Shape[] shapes = { new Rectangle(10, 10), new Circle(20) };
        
        double total =0;
        
        for (Shape shape : shapes) {
                total = total + shape.getArea();
            }
        System.out.println(total); 
	}

}
