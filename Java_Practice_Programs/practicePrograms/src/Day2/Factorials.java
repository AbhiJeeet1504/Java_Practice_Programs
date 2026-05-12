package Day2;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		
		
		// n! = n*(n-1)*(n-2)*(n-3).....
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number Factorial for ");
		int a=1; 
		int num = sc.nextInt();
		
		for(int i=2;i<=num;i++)
		{
			a = a*i;
		}

		System.out.println("Factorial of "+num+" is "+a);
	}

}
        