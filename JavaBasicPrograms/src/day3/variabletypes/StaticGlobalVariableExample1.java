package day3.variabletypes;

public class StaticGlobalVariableExample1 {
	//static global variables
	static int age=25;
	static boolean res;
	static char grade='B';
	static float roi;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("default value of age is: "+age);
		System.out.println("default value of res is: "+res);
		System.out.println("default value of grade is: "+grade);
		System.out.println("default value of roi is: "+roi);
		System.out.println("Program Ends");
		System.out.println(".........................");
		
		//initialization of static global variable
		StaticGlobalVariableExample1.age=25;
		StaticGlobalVariableExample1.res=true;
		StaticGlobalVariableExample1.grade='A';
		StaticGlobalVariableExample1.roi=6.5f;
		System.out.println("updated value of age is: "+StaticGlobalVariableExample1.age);
		System.out.println("updated value of res is: "+StaticGlobalVariableExample1.res);
		System.out.println("updated value of grade is: "+StaticGlobalVariableExample1.grade);
		System.out.println("updated value of roi is: "+StaticGlobalVariableExample1.roi);
		System.out.println("Program Ends");
		
		
		
		
		
		
		
		
				
	}


}
