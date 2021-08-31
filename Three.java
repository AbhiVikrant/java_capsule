/*
 * WAP to check inputed year is a leap year or not
 * 
 * A leap year is the year which is either divisible by 400 or 4 and not divisible by 100.
 */
import java.util.Scanner;
public class Three {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("A number of times to check enterd year whether its a leap year or not");
	int num=scan.nextInt();
	try {
	if(num<0)
		System.out.println(" Try to nter positive number");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
  
	while(num>0)
	{
		int year;
		boolean check;
		System.out.print("Enter Year: ");
	     year=scan.nextInt();
	     try {
	    		if(year <0)
	    			System.out.println(" Try to enter positive for year");
	    		else {check=checkLeapYear(year);
	    		if(check==true)
	    			System.out.println(year +" is a leap year");
	    		else
	    			System.out.println(year +" is not a leap year");
	    			
	    		}
	    			
	    		}
	     
	    		catch(Exception e)
	    		{
	    			e.printStackTrace();
	    			
	    		}
		
		num--;
		
		
	}
}
public static boolean checkLeapYear(int year)
{
	
		if((year%400==0) ||(( year%4==0 ) & (year%100!=0)))
		return true;
	    return false;
	}
}

