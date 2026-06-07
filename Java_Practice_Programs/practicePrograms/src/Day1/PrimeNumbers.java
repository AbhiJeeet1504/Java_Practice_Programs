package Day1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		//Prime numbers only divisible by 1 or itself    1 3 5 7 11 13 17 19 23 ........
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");

		int a = sc.nextInt();
		
		if(a/1==a && a%2 !=0)             //---incorrect logic
			
		{
			System.out.println(a+" is prime number");
		}

		else
		{
			System.out.println(a+" is not a prime number");
		}
	}

}
