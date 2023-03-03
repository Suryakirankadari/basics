package basics;

import java.util.Scanner;

public class Ternaryoperators {

	public static void main(String[] args) {
		// convert celsius to fahrenheit temperature
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temperature in celsius");
		float  celsius = sc.nextFloat();
		float fahrenheit = (celsius*1.8f) + 32;
		System.out.println("temperature" + fahrenheit);
	

	}

}
