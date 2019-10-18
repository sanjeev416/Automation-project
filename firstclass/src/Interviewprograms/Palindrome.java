package Interviewprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int i=0,j=0,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int num=sc.nextInt();
		a=num;
		
		while(a>0)
		{
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		
if(num==j) {
	
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}
	}

}
