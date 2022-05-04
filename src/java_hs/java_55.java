package java_hs;

class TV{
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
}

class ColorTV extends TV {
	private int color;
	
	
public ColorTV(int size, int color) {
	super(size);
	this.color = color;
	
}

public void printProperty() {
	
	System.out.println(super(size)+ "인치 "+ color + "컬러");
	
}


}

public class java_55 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV( 32 , 1024 );
		myTV.printProperty();

	}

}
