package ABB;

import java.util.LinkedList;

public class Run {

	public static void main(String[] args) {
	
		LinkedList<Integer> sa= new LinkedList<Integer>();
		sa.add(100);
		sa.add(200);
		sa.add(300);
		
		System.out.println("the list is" +sa);
		System.out.println(sa.size());
        System.out.println(sa.indexOf(1));
		System.out.println(sa.get(2));
		System.out.println(sa.remove(2));
		sa.add(1,600);
		System.out.println(sa);
		sa.set(1, 300);
		
		
		for (int i=0;i<sa.size();i++)
		{
			System.out.println(sa.get(i));
		}

	}

}
