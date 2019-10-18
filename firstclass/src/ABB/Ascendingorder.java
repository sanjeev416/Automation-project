package ABB;

public class Ascendingorder {

	public static void main(String[] args) {
		int num;
		int a[] = {10,100,400,300,200};
		{
			for(int i=0;i<a.length;i++)		
				
			{
				
			System.out.println(+i);	
			
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println(+j);
				if(a[i]>a[j])
				{
				num=a[i];
				a[i]=a[j];
				a[j]=num;			
				}
				
			}
			}
			
			System.out.println("Ascending order");
			
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[j]); 
			}
			
				
				
		

	}

}
}