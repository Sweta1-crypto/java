package anudip;
import java.util.Scanner;
 public class leapYear
 {
	
	 
	 public static void main (String[] args)
	 {
Scanner sc= new
Scanner(System.in);
	System.out.print("Enter a year:");
	int year = sc.nextInt();
	
		System.out.println( "is a leap year" +((year % 400 == 0)|| (year % 4 == 0) && (year % 100!= 0) ));
		}
 }


