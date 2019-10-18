package Interviewprograms;

public class Reverseofeachword {

	public static void main(String[] args) {
		String s = "Welcome";
		String[] split = s.split(" ");
		String reverseword = "";
		for(String x:split)
		{
			String Reverestring = "";
			
			for(int i=x.length()-1;i>=0;i--)
			{
			Reverestring = Reverestring+x.charAt(i);
			reverseword = reverseword+Reverestring+" ";
			
					}
			
			System.out.println("The original string is" +s);
			System.out.println("The reverse of each word is" +reverseword);
			
		}
		
		
		

		

	}

}
