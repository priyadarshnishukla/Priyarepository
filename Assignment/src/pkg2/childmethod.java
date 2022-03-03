package pkg2;

public class childmethod extends parentmethod {

	
	public void m4()
	{
		super.m3(2, 3, 3);
		super.m();
		super.m2(2, 3);
		super.m1(1);
 System.out.println("default child method");	
	}
	
	public void m5(int c) 
	{
 System.out.println("1 parametrized child method");	
	}
	
	public void m6(int c,int d) 
	{
		
		this.m7(1, 2, 3);
		this.m5(1);
 System.out.println("2 parametrized child method");	
	}
	
	
	public void m7(int c,int d, int e) 
	{
		this.m4();
 System.out.println("3 parametrized child method");	
	}
	
	public static void main(String[] args) {
	 
		childmethod obj= new childmethod();
		obj.m6(2, 3);
		
	}
	
	
	
	
}
