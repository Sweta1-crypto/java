package anudip;

import java.util.Scanner;

public class ValidTriangle
{
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter side 2: ");
		int b = sc.nextInt();
		System.out.println("Enter side 3 : ");
		int c = sc.nextInt();
		
		if((a + b > c) && (a + c > b) && (b+c>a)) 
		{
			System.out.print("Triangle is valid");
		}
		else
		{
			
			System.out.print("Triangle is  not valid");
		}
		
	}
}
