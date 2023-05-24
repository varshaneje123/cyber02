package inheritance11;

class A {

	public int reverseNumber(int number) {

		return 0;
	}

	public boolean palindrom(int number) {

		return true;
	}

	public boolean leapYear(int year) {

		return true;
	}

}

class B extends A {

	public int reverseNumber(int number) {
		return super.reverseNumber(number);
	}

	public boolean palindrom(int number) {

		return super.palindrom(number);
	}

	public boolean leapYear(int year) {

		return super.leapYear(year);
	}

	public void method1() {

	}

	public void method2() {

	}

}

public class Inheritance11 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.reverseNumber(1223));
		System.out.println(b.palindrom(1221));
		System.out.println(b.leapYear(1018));
		b.method1();
		b.method2();
	}

}
