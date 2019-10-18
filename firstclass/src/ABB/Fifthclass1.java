package ABB;

public class Fifthclass1 {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="Hello sanjeev";
		String s3="Hello Universe";
		String s4="Hello India";
		String s5="This is a Java program";
		
	boolean a=s4.equals(s4);
	System.out.println(a);
				
	boolean b=s1.equalsIgnoreCase(s1);
	System.out.println(b);
	
	String c=s4.toUpperCase();
	System.out.println(c);
	
	int d=s2.length();
	System.out.println(d);
	
	int e=s5.indexOf("Java");
	System.out.println(e);
	
	boolean f=s3.contains(s3);
	System.out.println(f);
		
	String g=s5.replace("is", "was");
	System.out.println(g);
	String h=s1.concat(s5);
	System.out.println(h);
	
	
	String i=s2.substring(3, 7);
	System.out.println(i);
	
	char[] ch=s5.toCharArray();
	for (int s=0;s<ch.length;s++)
	{
		
		System.out.println(ch[s]);
	}
	
	
	 char j=s5.charAt(2);
	System.out.println(j);
	
	
	int k=s4.compareTo(s5);
	System.out.println(k);
	
	boolean m=s5.startsWith("This");
	System.out.println(m);
	
	boolean n=s5.endsWith("program");
	System.out.println();
	
	
	String[] o=s5.split("java");
	
	for (int r=0;r<o.length;r++)
		
	{
		
		System.out.println(o[r]);
	}
	
	
	
	
	
	
	
	
	

	}

}
