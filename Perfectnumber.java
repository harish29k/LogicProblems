package logicalproblems;
/*
 * Just like the Armstrong number, the Perfect Number is also a special type of
positive number.
 */

import java.util.Scanner;
public class Perfectnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check:");
		int num=sc.nextInt();
		int n=0;
		for(int i = 1; i <= num/2 ;i++){
			if(num%i==0){
				n=n+i;
			}
			
			}
		if(n==num){
			System.out.println("the given number is a perfect number"+num);
		}else {
			System.out.println("the given number is not a perfect number"+num);
		}
	}

}
