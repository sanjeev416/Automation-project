package ABB;

public class Customer extends Iccbank {
	
	public void interest()
	
	{
		System.out.println("The rate of interest is 12% ");
		
	}
	
	public void profit()
	
	{
		
		
		
		System.out.println("profit is 2000");
	}
	public static void main(String[] args) 
	
	{
		
		Iccbank s= new Customer();
				s.interest();
				s.profit();
				
				
	}			


	}

