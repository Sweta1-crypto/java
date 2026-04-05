package anudip;

import java.util.Scanner;

public class CheckVowel 
	{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a character : ");
			char ch=sc.next().charAt(0);
	
			char ch1= (ch>='A' && ch<='Z')||(ch>='a' && ch<='z')?
					(ch>='A' && ch<='Z')?(char) (ch+32):ch:ch;
			
			System.out.println(ch1=='a'|| ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'?
					ch+" is a vowel": ch+" is not a vowel");
		}
	}


