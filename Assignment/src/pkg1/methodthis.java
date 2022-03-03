package pkg1;

public class methodthis {

	public void m() 
	{
		this.m3(2, 3, 5);
	System.out.println("default method");	
		
	}
	
	public void m1(int a) 
	{
		
	System.out.println("One parameterized method");	
		
	}
	
	public void m2(int a, int b) 
	{
		this.m();
		this.m1(2);
	
	System.out.println("Two parameterized method");	
	
	}
	
	
	public void m3(int a,int b,int c) 
	{
	System.out.println("Three parametrized method");	
		
	}
	
	
	public void m4(int a, int b, int c,int d) 
	{
	System.out.println("Four parameterized method");	
		
	}
	
	public void m5(int a, int b, int c,int d, int e) 
	{
	 this.m2(2, 3);
	 this.m4(1,2,3,4);
	System.out.println("Five parameterized method");	
	
	}
	
	public static void main(String[] args) {
		
		methodthis priya =new methodthis();
		priya.m5(11,22,33,44,55);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
