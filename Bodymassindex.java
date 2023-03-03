package basics;

import java.util.Scanner;

public class Bodymassindex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("weight of the person");
		float weight = sc.nextFloat();
		System.out.println("height of the person");
		float height = sc.nextFloat();
		float bmi = weight/(height*height);
		System.out.println("the mass index is" + bmi + "kg/m2");
	}

}
