package ABB;

public class Emp1 {
	
	public void empid()
	{
		
		int id = 10;
		System.out.println("The employee id is" +id);
	}

	
	public void empname(String name)
	
	{
		
		System.out.println("The name is" +name);
	}
	public static void main(String[] args) {
		
	Emp1 m1 = new Emp1();
	m1.empid();
	m1.empname("Sanjeev"); 

	}

}
