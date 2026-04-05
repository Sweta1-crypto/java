package anudip;
import java.util.Scanner;
public class CheckAlphabets 
{
	public static void main(String[] args) 
		{
//			to check whether the given character is an alphabet or not
//			1. use the alphabet range (value>='a' and value<='z') or (value>='A' and value<='Z')
//			2. use the unicode range (value>=65 and value<=90) or (value>=97 and value<=122)
//			for numeric range 48 to 57
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a character : ");
			char ch=sc.next().charAt(0);
			
			boolean result = (ch>=65 && ch<=90)||(ch>=97 && ch<=122);
			
			System.out.println(ch+" is an alphabet : "+result);
			System.out.println(ch+" is a numeric value : "+
			(ch>=48 && ch<=57));
			sc.close();
		}
	}
	


