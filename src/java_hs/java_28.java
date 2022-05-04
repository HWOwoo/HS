package java_hs;

 class Grade {
	
	int lang;
	int engl;
	int math;
	
	void initSubject(int lang,int engl,int math) {
		this.lang = lang;
		this.engl = engl;
		this.math = math;
	}
	
	int getSum () {
		return lang + engl + math;
	}

	double getAvg () {
		return (lang + engl + math) / 3;
	}
	
	char gradeTest () {
		
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



public class java_28 {

	public static void main(String[] args) {

		Grade Ham = new Grade();
		
		Ham.initSubject(90, 70, 80);
		
		System.out.println("총점은 : " + Ham.getSum());
		System.out.println("평균은 : " + Ham.getAvg());
		System.out.println(Ham.gradeTest());


		

	}

}