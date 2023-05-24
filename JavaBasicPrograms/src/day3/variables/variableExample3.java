package day3.variables;

public class variableExample3 {

	public static void main(String[] args) {

		System.out.println("Program Starts");

		variableExample2 v1 = new variableExample2();
		//variableExample3 v2 = new variableExample3();

		System.out.println("Area of circle :" + v1.areaOfCircle(5f));

		//System.out.println("Area of circle :" + variableExample2.areaOfCircle(6f));

		System.out.println("Area of rectangle :" + variableExample2.areaOfRectangle(10, 5));
		
		System.out.println("simpleInterest :" + variableExample2.si(10000, 5.5, 2));

		//System.out.println("convertTempToCelcius :" + convertTempToCelcius(97));

		System.out.println("Program Ends");

		
		
	}


}