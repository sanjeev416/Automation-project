package ABB;

import java.util.Vector;

public class Vl {
	

	public static void main(String[] args) {

Vector<Integer> va = new Vector<Integer>();

va.add(100);
va.add(200);
va.add(300);

System.out.println("The list is" +va);

System.out.println(va.get(1));
System.out.println(va.remove(2));
System.out.println(va.listIterator(2));


for (int i=0;i<va.size();i++)
{
	System.out.println(va.get(i));
}


		
		
	

	}

}
