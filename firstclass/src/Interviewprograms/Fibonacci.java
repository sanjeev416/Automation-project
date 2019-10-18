package Interviewprograms;


public class Fibonacci {

	public static void main(String[] args) {

		int a=0,b=1;
		System.out.println(+a);
		System.out.println(+b);
		
		while(true)
		{
			int c=a+b;
			if (c<500)
			{
			a=b;
			b=c;		
System.out.println(c);
		}	
			
			else {
				break;
			}
		
		
		
		
				
		}
	}

}
