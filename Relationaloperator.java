package basics;

import java.util.Scanner;

public class Relationaloperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age ");
		int age = sc.nextInt(),base_age = 18;
		
		if (age<=0) {
			System.out.println("invalid ");
		}
		else  if (age<18){
			System.out.println("you are not elgible to apply");
		}
		else {
			System.out.println("you are eligble");
			
		}
		
		
		
		
	}

}
