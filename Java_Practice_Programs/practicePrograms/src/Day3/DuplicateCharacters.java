package Day3;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String a = sc.next();
		
		char[] arr =  a.toCharArray();
		
		for (int i=0; i<a.length();i++ )
		{
			for(int j=0; j<i;j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					System.out.println("First repeat char is "+ a.charAt(i));
				}
				
			}
		}
		
		
	}

}
