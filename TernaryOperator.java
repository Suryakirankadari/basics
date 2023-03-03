package basics;

public class TernaryOperator {

	public static void main(String[] args) {
		//condition ? statement1: statement2
		// a<b? a+b : a-b
		int a = 30;
		int b = 40;
		int result = (a<b?a+b :a-b);
		System.out.println(result);
	}

}
