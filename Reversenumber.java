package logicalproblems;
/*
 * In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
 */
import java.util.Scanner;
public class Reversenumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to reverse ");
		int num = sc.nextInt();
		int x=0;
		int y=0;
		while(num != 0) {
			x=num%10;
			y=y*10+x;
			num=num/10;
		}
		System.out.println("the reverse number of given number is "+y);
	}

}
