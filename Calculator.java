import java.util.Scanner;
public class Calculator
{
	public static double addition(double a, double b)
	{
		return a + b;
	}
	public static double substraction(double a, double b)
	{
		return a - b;
	}
	public static double multiply(double a, double b)
	{
		return a * b;
	}
	public static double division(double a, double b)
	{
		if (b == 0) {
            		System.out.println("Error: Division by zero is not allowed.");
            return 0;
        	}
        	return a / b;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Boolean continue_cal = true;
		while(continue_cal)
		{
			System.out.println("---Simple Calculator---");
			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter second number: ");
           		double num2 = sc.nextDouble();
			System.out.println("Choose an operation:");
            		System.out.println("1. Addition (+)");
            		System.out.println("2. Subtraction (-)");
            		System.out.println("3. Multiplication (*)");
            		System.out.println("4. Division (/)");
            		System.out.print("Enter your choice (1-4): ");
            		int choice = sc.nextInt();
			double result = 0;
			switch (choice) {
                		case 1:
                    			result = addition(num1, num2);
                    			System.out.println("Sum of two numbers: " + result);
                    			break;
                		case 2:
                    			result = substraction(num1, num2);
                    			System.out.println("Result: " + result);
                    			break;
                		case 3:
                    			result = multiply(num1, num2);
                    			System.out.println("Result: " + result);
                    			break;
                		case 4:
                    			result = division(num1, num2);
                    			System.out.println("Result: " + result);
                    			break;
                		default:
                    			System.out.println("Invalid choice.");
            		}

            		System.out.print("Do you want to perform another calculation? (yes/no): ");
            		sc.nextLine();  // consume the leftover newline
            		String response = sc.nextLine();

            		if (!response.equalsIgnoreCase("yes")) {
                		continue_cal = false;
                		System.out.println("Exiting calculator. Goodbye!");
            		}
        	}

        	sc.close();
    	}
}
			

