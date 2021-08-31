/*
 * WAP to enter two numbers and swap their values without using third variables
 * Enter two numbers:
 * 23
 * 44
 * Output as
 * 
 * 44 23
 */
import java.util.Scanner;
public class Two {
	public static void swapValues(int num1, int num2)
	{
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Interchanged values are: "+num1 +" "+num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Entered values are: "+num1 +" "+num2);
		swapValues(num1,num2);
}
}
