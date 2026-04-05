package anudip;

import java.util.Scanner;

	public class calculatebonus {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter salary : ");
			int salary = sc.nextInt();
			
			System.out.println("Enter Experience : ");
			int exp=sc.nextInt();
			
			float bonus = (float) (exp>=20 ? salary*0.20 : salary *0.10);
			System.out.println("Your bonus is : "+bonus);
			sc.close();

		}

	}

