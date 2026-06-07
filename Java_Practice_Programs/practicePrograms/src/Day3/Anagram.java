package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings :");

		String a = sc.next();
		String b = sc.next();

		System.out.println("-----");
		anagramCheck(a, b);
		

	}

	public static void anagramCheck(String a, String b) {
		if (a.length() != b.length()) {
			System.out.println("Not an Anagram");
			;
		}

		else {
			char[] s = a.toCharArray();
			char[] t = b.toCharArray();

			Arrays.sort(s);
			Arrays.sort(t);

			if( Arrays.equals(s, t))
				System.out.println("Strings are anagram");
				else
				{
					System.out.println("Strings are not anagram");
				}
		}
	}
}
