package java_hs;

class Humans {
	
	int eye = 2;
	
	public int getEye() {
		return eye;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}
	
	void printEye() {
		System.out.println(eye);
	
}

public class java_27 {

	public static void main(String[] args) {

		
		Humans humans = new Humans();
		
		humans.setEye(3);
		humans.printEye();
		System.out.println(humans.eye);

	}
	

	}

}
