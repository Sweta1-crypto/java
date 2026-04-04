package anudip;

import java.util.Scanner;

public class evenorodd {
	public static void main (String[] args)
	 {
Scanner sc= new
Scanner(System.in);
	System.out.print("number:");
	int number = sc.nextInt();
	int even = 0;
	int odd = 0;
String result = (number %2==0)?"number is even": "number is odd";
	System.out.println( result);
}
}
