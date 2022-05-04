package java_hs;

import java.util.Scanner;

class Grades {
	
	private int lang;
	private int engl;
	private int math;
	
	public Grades(int lang,int engl,int math) {
		this.lang = lang;
		this.engl = engl;
		this.math = math;
	}
	
	public int getSum () {
		return lang + engl + math;
	}

	public double getAvg () {
		return (lang + engl + math) / 3;
	}
	
	public char gradeTest () {
		
		double avg = getAvg();
		char grade;
		
		
	if ( avg >= 90) {
		grade = '수';
	}	else if ( avg >= 80 ) {
		grade = '우';
	}	else if ( avg >= 70 ) {
		grade = '미';
	}	else if ( avg >= 60 ) {
		grade = '양';	
	}	else {
		grade = '가';
	}
		return grade;
	}
	
}



public class java_40 {

	public static void main(String[] args) {

		Grades Ham = new Grades();
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Ham.initSubject(a, b, c);
		
		System.out.println("총점은 : " + Ham.getSum());
		System.out.println("평균은 : " + Ham.getAvg());
		System.out.println(Ham.gradeTest());


	}
}