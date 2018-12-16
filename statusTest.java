package sample;

/**
 * 
 * @author Herng-Shyue Chen
 *
 */

public class statusTest {

	public static void main(String[] args) {
		int a = 5/2; //2
		//int a = 5/2.0; int cannot be a double or float type
		double b = 5/2; //2.0
		double c = 5.0/2; //2.5
		double d = 5/2.0; //2.5
		float e = 5/2; //2.0
		//float f = 5/2.0; if no "f" after the decimal number, error will occur
		float f = 5/2.0f; //2.5
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
