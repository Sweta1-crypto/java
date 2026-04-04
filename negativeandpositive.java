package anudip;
import java.util.Scanner;
public class negativeandpositive
{
	 public static void main (String[] args)
	 {
Scanner sc= new
Scanner(System.in);
	System.out.print("enter a number:");
	int number = sc.nextInt();
	boolean positive = true;
	boolean negative = false;
	int zero = 0;
	 String result = (number>=0)? "positive": (number<0)?"negative": "zero" ;
	System.out.println( result);
	
}
}