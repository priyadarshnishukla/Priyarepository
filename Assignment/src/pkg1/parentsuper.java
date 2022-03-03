package pkg1;

public class parentsuper {

	
	public parentsuper() 
	
	{
		this(1, 2, 3);
	System.out.println("default parent constructor");
	}
	
 public parentsuper(int a ) 

	{
	 this(1, 2);
	System.out.println("1 parametrized parent constructor");
	}


 public parentsuper(int a , int b) 

{
	 this();
System.out.println("2 parametrized parent constructor");
}
	
 public parentsuper(int a,int b,int c ) 

{
System.out.println("3 parametrized parent constructor");
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
