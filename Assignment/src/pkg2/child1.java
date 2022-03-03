package pkg2;

public class child1 extends parent1{

	public void m8() 
	{
		
 System.out.println(" default child method");	
	}	
	
	public void m9(int a) 
	{
		
 System.out.println(" one parametrized child method");	
	}	
	
	public void m10(int a, int b) 
	{
		
 System.out.println(" Two parametrized child method");	
	}
	
 public void m11(int a, int b,int c) 
	{
		
 System.out.println(" Three parametrized child method");	
	}
	
	public static void main(String[] args) {
		child1 obj = new child1();
		obj.m3(3, 5, 8);
		obj.m6(3, 5);
		obj.m8();
		obj.m1(22);
		obj.m11(4, 5, 9);
		obj.m2(3, 6);
	}
	
	
	
}
