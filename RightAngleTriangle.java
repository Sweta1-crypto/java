package anudip;

import java.util.Scanner;

public class RightAngleTriangle {
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter side 2: ");
		int b = sc.nextInt();
		System.out.println("Enter side 3 : ");
		int c = sc.nextInt();
	 if (a*a ==b*b||b*b==c*c)
		 {
			 System.out.print("Triangle is right angle");
		 }
			else
			 {
			  System.out.print("Triangle is  not right angle");
			 }
		 }
	}

