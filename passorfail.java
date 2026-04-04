 package anudip;

import java.util.Scanner;

public class passorfail {
	public static void main (String[] args)
	 {
Scanner sc= new
Scanner(System.in);
	System.out.print("marks:");
	int marks = sc.nextInt();
	String result = (marks>= 45)?"you are pass": "you are fail";
	System.out.println( result);
}
}
