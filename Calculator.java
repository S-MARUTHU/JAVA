package Practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
		        Scanner sc = new Scanner(System.in);

		        // Input two numbers
		        System.out.print("Enter first number: ");
		        int num1 = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int num2 = sc.nextInt();

		        // Choose operation
		        System.out.println("Choose operation: add, sub, multiply, divide, modulus");
		        String operation = sc.next().toLowerCase();

		        switch (operation) {
		            case "add":
		                System.out.println("Result: " + (num1 + num2));
		                break;
		            case "sub":
		                System.out.println("Result: " + (num1 - num2));
		                break;
		            case "multiply":
		                System.out.println("Result: " + (num1 * num2));
		                break;
		            case "divide":
		                if (num2 != 0) {
		                    System.out.println("Result: " + (num1 / num2));
		                } else {
		                    System.out.println("Error: Division by zero not allowed!");
		                }
		                break;
		            case "modulus":
		                if (num2 != 0) {
		                    System.out.println("Result: " + (num1 % num2));
		                } else {
		                    System.out.println("Error: Division by zero not allowed!");
		                }
		                break;
		            default:
		                System.out.println("Invalid operation! Try add, sub, multiply, divide, modulus.");
		        }

		        sc.close();
		    }
		}

	}

}
