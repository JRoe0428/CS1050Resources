import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
		Double number1, number2, result;
		
		// Object Scanner
		Scanner input = new Scanner(System.in);
		
		// asks user to input number
		System.out.println("Enter First Number");
		number1 = input.nextDouble();
		
		System.out.println("Enter Second Number");
		number2 = input.nextDouble();
		
		switch (operator) {
		
		// performs addition between numbers
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		
		}
	}

}
