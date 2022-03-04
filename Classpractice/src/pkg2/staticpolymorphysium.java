package pkg2;

public class staticpolymorphysium {

	
	public void addition(int a, int b ) {
		
		int c;
		c= a+b;
		System.out.println("value of " + c);
	}
	
	
public void addition(int a, int b,int c ) {
		
		int d;
		d= a+b+c;
		System.out.println("value of " + d);
	}
	
	
	public static void main(String[] args) {
		
		staticpolymorphysium ob = new staticpolymorphysium();
		ob.addition(22,22);
		ob.addition(2, 3, 4);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
