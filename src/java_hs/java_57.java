package java_hs;

class Point {
	
	   private int x, y;
	   
	   public Point(int x, int y) { 
		   this.x = x; this.y = y; 
		   }
	   
	   public int getX() {
		   return x; 
		   }
	   
	   public int getY() {
		   return y; 
	   }
	   
	   protected void move(int x, int y) {
		   this.x =x; this.y = y; 
		   }
	   
	}

class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint ( int x, int y, String color ) {
		super(x,y);
		this.color = color;
	}
	
	public void setXY(int i, int j) {
		super.move(i, j);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return this.color + "색의 " + super.getX() + "," + super.getY() +"의 점";
	}
	
}

public class java_57 {

	public static void main(String[] args) {
			   ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
			   
			   cp.setXY(10, 20);
			   cp.setColor("RED");
			   
			   String str = cp.toString();
			   
			   System.out.println(str+"입니다. ");
			

	}

}
