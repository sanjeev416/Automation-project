package Interviewprograms;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		int i=0,j=0,a,n;
		n=153;
		a=n;
		while(a>0)
		
		{
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		
		if(n==j)
		{
			System.out.println("It is an Armstrong number");
		}
		
		else
		{
			System.out.println("Not an Armstrong number");
		}


	}

}
