package ABB;

public class Poly {
	
	public float add(int a, int b)
	
	{
		
		return a + b;
			
	}
	
	public float add(float a, float b)
	
	{
		
		return a + b;
		
	}

	public static void main(String[] args) 
	
	{

		Poly p = new Poly();
		System.out.println(p.add(15, 30));
		System.out.println(p.add(4.2f, 3.5f));
		
		
		
	}

}
