package ABB;

import java.util.HashMap;

public class Countofeachcharacter {

	public static void main(String[] args) {
		
		String s = "Welcome to chennai";
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(+i);
			char c = s.charAt(i);
			if(map.containsKey(c))
			{
				Integer count = map.get(c);
				count++;
				map.put(c, count);
				}
			else {
				map.put(c, 1);
			}
			
		}
			
System.out.println(map);
				
			}
				
			}
	


	

