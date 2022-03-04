package pkg2;

import pkg1.hasarelation1;

public class anotherpkg {

	int c;
	int b;
	
	public void display() {
		
		System.out.println("display method1");
	}
	
	public void display1() {
		
		System.out.println("display method2");
		
	}
	
	
	public static void main(String[] args) {
	
		hasarelation1 priya= new hasarelation1();
		anotherpkg priya1 = new anotherpkg();
		
		priya.method1();
		priya1.display1();
		priya1.b=1;
		priya.a=50;
		System.out.println("value of b " +priya1.b);
		System.out.println("value of a " +priya.a);

	}
	
	
	
}
