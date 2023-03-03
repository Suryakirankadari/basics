package basics;

import java.util.Scanner;

public class Averagenumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("average of the numbers");
		
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float num3 = sc.nextFloat();
		
		
		System.out.println("Average :" + (num1 + num2 + num3)/3);
		
		
	}

}
