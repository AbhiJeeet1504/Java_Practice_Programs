package Day1;

public class Swap_numbers_3ways {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 0;

		// noob way
		d = a;
		a = b;
		b = c;
		c = d;

		/*
		 * a = a^b; b= b^c; c= a^c; applies only for 2 numbers
		 */

		System.out.println(a + " " + b + " " + c);

		// Expert way without temp

		int aa = 10;
		int bb = 20;
		int cc = 30;
		// aa= 20 bb=30 cc=10

		aa = aa + bb + cc; // aa=60
		cc = aa - bb - cc; // cc=60-20-30=10
		bb = aa - cc - bb; // bb=60-20-10=30
		aa = bb - cc;

		System.out.println("aa is" + aa + " bb is " + bb + " cc is " + cc);

		//swapping 2 numbers using XOR
		
		int x=10; int y=20;
		x=x^y;
		y=y^x;
		x=x^y;
		System.out.println(x+" "+y);

	}

}
