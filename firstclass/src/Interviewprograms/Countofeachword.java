package Interviewprograms;

import java.util.HashMap;
import java.util.Map;

public class Countofeachword {

	public static void main(String[] args) {

String s = "Welcome to java";
		 
String [] spt = s.split("");

Map<String, Integer> m = new HashMap<String, Integer>();

for(String word: spt)

{
	if(m.containsKey(word))
	{
		Integer count = (m.get(word));
		m.put(word, count+1);
		
	}
	
	else {
		m.put(word, 1);
	}
	
	System.out.println(m);
	
}
	
	


		
		
		
				
		

	}

}
