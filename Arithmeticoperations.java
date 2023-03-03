package basics;

import java.util.Scanner;

public class Arithmeticoperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		float a= sc.nextFloat();
		System.out.println("enter the value of b");
		float b= sc.nextFloat();
		
		System.out.println("additon of two numbers" + (a+b));
		System.out.println("subtraction of two numbers" + (a-b));
		System.out.println("division of two numbers" + (a/b));
		System.out.println("multiplication of two numbers" + (a*b));
	}

}
