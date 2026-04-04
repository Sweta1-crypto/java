package anudip;
import java.util.Scanner;
public class voteperson {
	 public static void main (String[] args)
	 {
Scanner sc= new
Scanner(System.in);
	System.out.print("Enter a voteperson:");
	int year = sc.nextInt();
	int voteperson = 0;
	String result = (voteperson>=18)?"you are eligible to vote": "you are not eligible for vote";
	System.out.println( result);
}
}