package pkg1;

public class childclass extends parentsclass

{

	float b;
	
	public void display1() {
		
		System.out.println("he is child" );
	}

	
	public static void main(String[] args) {
		
		
		childclass obj= new childclass();
		obj.a=1;
		obj.display();
		obj.b=4;
		obj.display1();
		
    System.out.println("value of a " + obj.a);
    System.out.println("value of b " + obj.b);
	}
	

	
	
	
	
	
	
	
	
	
	
}
