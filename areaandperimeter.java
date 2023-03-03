package basics;

import java.util.Scanner;

public class areaandperimeter {

	public static void main(String[] args) {
		
 		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the radius of the circle");
		float radius = sc.nextFloat();
		final float pi = 3.14f;
		
		System.out.println("area of the circle" + ( pi*radius));
		System.out.println("perimeter of the circle" + ( 2*pi*radius));
				

		
	}

}
