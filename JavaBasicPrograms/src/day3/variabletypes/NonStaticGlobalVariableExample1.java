package day3.variabletypes;

public class NonStaticGlobalVariableExample1 {

//non static global variables
		int age;
		boolean res;
		char grade;
		float roi;
		public static void main(String[] args) {
			System.out.println("Program Starts");
			//System.out.println(age);//we can't access non-static member directly from main() because it's static
			//to avoid above error first we need to load all the non-static members into the memory
			//create an instance/object of required class
			NonStaticGlobalVariableExample1 ref; //object declaration
			ref = new NonStaticGlobalVariableExample1() ; // object initialization
			//or
			
			NonStaticGlobalVariableExample1 ref1 = new NonStaticGlobalVariableExample1();
			System.out.println("default, Non-Static variable age: "+ref1.age);
			System.out.println("default, Non-Static variable res: "+ref1.res);
			System.out.println("default, Non-Static variable grade: "+ref1.grade);
			System.out.println("default, Non-Static variable roi: "+ref1.roi);
			System.out.println("Program Ends");
			System.out.println(".........................Updating non-static variables............");
			ref1.age=25;
			ref1.res=true;
			ref1.grade='B';
			ref1.roi=7.5f;
			System.out.println("updated Non-static variable age: "+ref1.age);
			System.out.println("updated Non-static variable res: "+ref1.res);
			System.out.println("updated Non-static variable grade: "+ref1.grade);
			System.out.println("updated Non-static variable roi: "+ref1.roi);
			System.out.println("Program Ends");
			
			
			
			
			
			
	}

}
