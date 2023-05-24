package staticmethods;

public class Example1 {
	public static void display() {
		System.out.println("Hi my name is varsha");
		System.out.println("I am learning core java");
		System.out.println("my contact number is 12456");
	}
		static void ShowDetails(String name, char grade,int num) {
			System.out.println("Hi, i am" +name);
			System.out.println("my grade is" +grade);
			System.out.println("my number is" +num);}
			 static void addnumber() {
				int num1=10,num2=20,res;
				 res=num1+num2;
				System.out.println("Number 1 is :" +num1);
				System.out.println("Number 1 is  : "+num2);
				System.out.println("Result is : "+res);}
			 static void addnumber(int num1, int num2) {
					int res;
					 res=num1+num2;
					System.out.println("Number 1 is :" +num1);
					System.out.println("Number 1 is  : "+num2);
					System.out.println("Result is : "+res);}
			 
				public static void main(String[] args) {
					display ();
					//System.out.println(display));//as this won't return any value hence we can't write it inside println(
					ShowDetails("pune" , 'A',98556);
					ShowDetails("Mumbai" , 'B',90225);
					ShowDetails("Delhi" , 'C',98746);
					System.out.println("********************");
					addnumber() ;
					Example1.addnumber();
					System.out.println("***********************");
					addnumber(15 ,25);
					Example1.addnumber(55, 45);
					
					
					
		
	}

}
