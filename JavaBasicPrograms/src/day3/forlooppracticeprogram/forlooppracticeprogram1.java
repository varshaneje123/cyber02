package day3.forlooppracticeprogram;

public class forlooppracticeprogram1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		// syntax to declare text five times & display 1 to 5 numbers;
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println("Hi" + i);

		}

		// syntax to declare sum of n natural numbers;
		int n;
		n = 15;
		int sum = 0;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum of all natural number" + sum);

		// syntax to declare upper cased alphabet;
		char c;
		for (c = 'A'; c <= 'Z'; c++)
			System.out.print(c + ",");

		// syntax to declare upper cased alphabet;
		for (c = 'a'; c <= 'z'; c++)
			System.out.print(c + ",");

		// syntax to declare count number of digits in an integer;
		int number = 312;
		int count = 0;

		for (; number != 0; number = number / 10) {
			count++;
		}
		System.out.println("\nnumber of digits ==" + count);

		// syntax to declare reverse number;
		int number2 = 312;
		int reverseNumber2 = Integer.parseInt(reverse(number2));
		System.out.println("reverse of number2 :" + reverseNumber2);

		int number3 = 2002;
		int reverseNumber3 = Integer.parseInt(reverse(number3));
		if (number3 == reverseNumber3) {
			System.out.println("the number3 is palindrome");
		} else {
			System.out.println("the number3 is not palindrome");
		}
		//
	}

	static String reverse(int number2) {
		// int number2 = 312;
		String reverse = "";

		for (; number2 != 0;) {
			reverse = reverse + (number2 % 10);
			number2 = number2 / 10;
		}

		return reverse;
		
	}
		

		
	}

