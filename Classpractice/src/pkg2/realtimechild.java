package pkg2;

public class realtimechild extends realtimeparent {

	
	
	
	
	public int  multi (int a, int b, int c) {
		
		int d;
		d=a*b*c;
		System.out.println(" multiplication of " + d);
		return d;
		
	}
	
	
	public static void main(String[] args) {
		
		realtimechild obj = new realtimechild();
		obj.multi(1, 3, 5);
		obj.addition(22, 33);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
