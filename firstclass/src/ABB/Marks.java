package ABB;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int phy;
		int chem;
		int mat;
		Scanner sc=new Scanner(System.in);
		phy=sc.nextInt();
		chem=sc.nextInt();
		mat=sc.nextInt();
		int sum;
		sum = phy+chem+mat;
		if(sum > 70)
		{
			
		System.out.println("The student is passed" +sum);
		
		}
		
		else if(sum < 70)
		{
			System.out.println("The student is failed " +sum);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
