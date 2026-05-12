package Day1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		// MOM , RACECAR, DAD, LEVEL .... 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String ");
		
		
		String arr = sc.next();
		String brr = "";
		
		for(int i=arr.length()-1;i>=0;i--)
		{
			brr =brr+arr.charAt(i); 
		}
		
		if(brr.equalsIgnoreCase(arr))
		{

			System.out.println(brr + " is palindrome");
		}
		else
		{
			{

				System.out.println(brr + " is not a palindrome");
			}
		}
		

	}

}
