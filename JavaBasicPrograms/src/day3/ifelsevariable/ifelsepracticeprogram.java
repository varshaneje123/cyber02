package day3.ifelsevariable;

public class ifelsepracticeprogram {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//syntax to declare even & odd number;
	
		int num=125;
		
		if(num%2==0) {
		System.out.println("even number");
	} else {
		System.out.println("odd number");
	}
		char c= 'z';
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
			
			//syntax to declare largest number;
			int num1=10;
			int num2=15;
			int num3=20;
			if( num1>num2&&num1>num3) {
			System.out.println("largest number"+ num1);
			}   else if (num2>num1&&num2>num3) {
				System.out.println("largest number"+ num2);
			} else if (num3>num1&&num3>num2) {
				System.out.println("largest number"+ num3);
				
			}
			
			//syntax to declare leap year;
			int year=2000;
			if (((year%4 ==0)&&(year %100!=0)) ||(year%400 ==0)) {
				System.out.println("leap year");
			} else {
				System.out.println("common year or non-leap year");
						
			}
			
			//syntax to declare positive or negative number;
		
				
			}
			
			
			
			
			
					
			
			
		
			
			
		
		}
		
	}


