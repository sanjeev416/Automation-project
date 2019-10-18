package Interviewprograms;

import java.util.ArrayList;
import java.util.List; 

public class Countofinteger {



public static void main(String[] args) {
	
	int a[]= {1,2,3,45,6};
	int count=1;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		
			if(a[i]==a[j])
				count++; 
			System.out.println(a[j]);
	}
	
		

}
}
}


	
	
	




