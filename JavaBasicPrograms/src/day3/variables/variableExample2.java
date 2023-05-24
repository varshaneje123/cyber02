package day3.variables;

public class variableExample2 {

	public static void main(String[] args) {

		System.out.println("Program Starts");

		variableExample2 v1 = new variableExample2();
		variableExample2 v2 = new variableExample2();

		System.out.println("Area of circle :" + v1.areaOfCircle(5f));

		System.out.println("Area of circle :" + v2.areaOfCircle(6f));

		System.out.println("Area of rectangle :" + areaOfRectangle(10, 5));
		
		System.out.println("simpleInterest :" + si(10000, 5.5, 2));

		System.out.println("convertTempToCelcius :" + convertTempToCelcius(97));

		System.out.println("Program Ends");

	}

	float areaOfCircle(float radius) {
		final float PI = 3.14f;
		// calculating area of circle
		return PI * radius * radius;
	}

	static double areaOfRectangle(double l, double w) {
		return l * w;

	}

	static double si(int p, double r, int time) {
		return (p * r * time) / 100;

	}

	static int convertTempToCelcius(int f) {

		return (f - 32) * 5 / 9;

	}

}