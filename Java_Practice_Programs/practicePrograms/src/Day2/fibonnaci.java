package Day2;

import java.util.Scanner;

public class fibonnaci {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34 55 .....
		
		System.out.println("enter number to calculate fibonacci: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a=0;
		int b=1;
		
		for(int i=0; i<num; i++)
		{
			System.out.print(a+" ");
			int c= a+b;
			a= b;
			b= c;
			}
	}

}
