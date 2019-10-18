package Interviewprograms;

public class Ascendingorder {

	public static void main(String[] args) {

		int arr[] = {1,10,30,40,20,60,50};
		
 int temp;
 
 for(int i=0;i<arr.length;i++)
 {
	 for(int j=i+1;j<arr.length;j++)
	 {
		 if(arr[i]>arr[j]) {
			 
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 
			 
		 }
	 }
 }
 
 System.out.println("Ascending order");
 
 for(int j=0;j<arr.length;j++)
 {
	 
	 System.out.println(arr[j]);
	 
 }
 

 

	}

}
