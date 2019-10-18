package ABB;

import java.util.ArrayList;

public class Time {

	public static void main(String[] args) {
		
	ArrayList<Integer>data = new ArrayList<Integer>();
	
	data.add(100);
	data.add(200);
	data.add(250);
	data.add(350);
	
	System.out.println("The list is" +data);
	System.out.println(data.size());
	System.out.println(data.get(3));
	
	for(int i=0;i<data.size();i++)
	{
		System.out.println(data.get(i));
		
	}
	
	for(Integer R : data)
	{
		System.out.println(R);
	}
	
	System.out.println(data.contains(250));
	
	System.out.println(data.indexOf(200));
	
	data.add(1,600);
	System.out.println(data);
	
	data.set(1, 700);
	System.out.println(data);
	
	data.remove(0);
	System.out.println(data);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
		
		

		
		

	}

}
