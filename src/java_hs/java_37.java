package java_hs;

import java.util.Scanner;

class Strstr {
	String eng = null;
	int i = 0;
	int conson, vowel = 0;
    
	
	
    void consonant() {
    	
        while(true)
        {
			if(eng.charAt(i) == 'a' || 
			eng.charAt(i) == 'e' || 
			eng.charAt(i) == 'i' || 
			eng.charAt(i) == 'o' || 
			eng.charAt(i) == 'u'){
            conson += 1;
            i++;
            } else {
            vowel += 1;
            i++;
            }
            
            if(i == eng.length()) break;
        }
        
        System.out.println("모음의 개수는 "+conson+"개입니다.");
        System.out.println("자음의 개수는 "+vowel+"개입니다.");
    }
}

public class java_37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Strstr Str_eng = new Strstr();
		
		String eng = sc.next();
		
		System.out.println("문자열을 입력하시오");
		Str_eng.eng = sc.nextLine();
		
		Str_eng.consonant();
		
	}
		

	}


