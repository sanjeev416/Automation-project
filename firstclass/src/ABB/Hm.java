package ABB;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hm {

	    public static void main(String[] args) {
		
		HashMap<String, Integer> marks = new HashMap<String,Integer>();
		marks.put("phy", 100);
		marks.put("chem", 200);
		marks.put("Eng", 300);
		
	   Integer res = marks.get("phy");
	   System.out.println("Phy mark" +res);
		
	  Set<String> key = marks.keySet();
	  for(String s1 : key)
		  
	{
	 System.out.println("the value is" +s1);
		
	}
	
	Collection<Integer> val = marks.values();
	for (Integer v2 : val)
		
	{
		System.out.println("The value is" +v2);
	}
	
	Set<Entry<String,Integer>> entry = marks.entrySet();
	for (Entry<String,Integer> e1 : entry)
	{
		
		System.out.println(e1.getKey()+"the value of key and value"+e1.getValue());
	}
	
	System.out.println(marks.containsKey("phy"));
	
	System.out.println(marks.remove("chem"));
	    
	

	}

}
