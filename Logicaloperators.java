package basics;

import java.util.Scanner;

public class Logicaloperators {

	public static void main(String[] args) {
		//logical operators  &&  , || 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num1 = sc.nextInt();
		if (num1%5==0 && num1%10==0) {
			System.out.println("the number is divisble by both 5 and 10");
		}
		else {
			System.out.println("the number is divisible by 5 or 10");
		}
	
	}

}
