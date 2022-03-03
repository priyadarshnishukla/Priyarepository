package pkg1;

public class constructor {

	public constructor()
	{
		this(11,22,33);
    System.out.println(" Default constructor");
	}
	
	
	public constructor(int a)
	{
		this(11,22,33,33);
    System.out.println(" One parametrized constructor");
	}
	
	
	public constructor(int a, int b)
	{
		this();
    System.out.println(" Two parametrized constructor");
	}
	
	public constructor(int a, int b, int c)
	{
		
    System.out.println(" Three parametrized constructor");
	}
	
	
	public constructor(int a, int b, int c, int d)
	{
		this(11,22);
    System.out.println(" Four parametrized constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		constructor priya = new	constructor(11);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
