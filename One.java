// WAP to input a number and print its digits in reverse order 
/* 
 * Number Input: 2
 * Inputed Number: 123
 * Reversed Output: 3,2,1
 * Inputed Number: -123
 * Reversed Output: 3,2,1
 */
import java.util.Scanner;
public class One {
        public static void printNumberDigitInReverseNumber(int num)
        {
        	if(num<0)
        	{
        		String str=Integer.toString(num);
        		str=str.substring(1, str.length());
        		int i=str.length();
        		while(i>0) {
        			if(i!=1)
        			System.out.print(str.charAt(i-1)+",");
        			else {
        				System.out.print(str.charAt(i-1));
        			}
        			i--;
        		}
        	}
        	else {
        		String str=Integer.toString(num);
        		int i=str.length();
        		while(i>0) {
        			if(i!=1)
        			System.out.print(str.charAt(i-1)+",");
        			else {
        				System.out.print(str.charAt(i-1));
        			}
        			i--;
        		}
        	}
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Number Input: ");
		int num=scan.nextInt();
		while(num>0) {
			System.out.print("Inputed Number: ");
			int number=scan.nextInt();
			printNumberDigitInReverseNumber(number);
			System.out.println();
			num--;
		}
		

	}

}
