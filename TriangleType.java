package anudip;

import java.util.Scanner;

public class TriangleType {
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter side 2: ");
		int b = sc.nextInt();
		System.out.println("Enter side 3 : ");
		int c = sc.nextInt();
		
		if((a == b && b == c)
		{
			System.out.print("Triangle is Equilateral ");
		}
		
		else if (a ==b || b==c || a==c)
		 {
			 System.out.print("Triangle is isosceles ");
		 }
			else
			 {
			  System.out.print("Triangle is  Scalene ");
			 }
		 }
	}

