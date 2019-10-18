package Interviewprograms;

public class Reversestring {

	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		
		System.out.println(s);
		String Reverse = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			Reverse = Reverse + s.charAt(i);
						
		}
		 
      System.out.println("The revers of and string is" +Reverse);

	}

}
