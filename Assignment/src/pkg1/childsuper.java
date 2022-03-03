package pkg1;

public class childsuper extends parentsuper
  {

	public childsuper() 
	{
		super(1);
		System.out.println("child default constructor");
	}
	
	public childsuper(int a) 
	{
		
		this(1, 2, 3);
		System.out.println("child 1 parametrized constructor");
	}
	
	public childsuper(int a ,int b) 
	{
		this(2);
		System.out.println("child 2 parametrized constructor");
	}
	
	
	
	public childsuper(int a ,int b,int c) 
	{
		this();
		System.out.println("child 3 parametrized constructor");
	}
	
	
	public static void main(String[] args) {
		childsuper obj=new childsuper(1,2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
