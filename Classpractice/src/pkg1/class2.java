package pkg1;

public class class2 {    //(10+2)(10-2)

	public int sum (int a,int b) {
		
		int c;
		c=a+b;
		System.out.println("sum of results"+c);
		return c;
	}
	
	public int sub(int d,int e) {
		
		int f;
		f= d-e;
		System.out.println("sub of results"+f);
		return f;
		
	}
	
public void multi(int g,int h) {
	int i;
	i= g*h;
	System.out.println("multi of results"+ i);
	
	}
	
public static void main(String[] args) {
	
	class2 priya= new class2();
	int sumresults=priya.sum(10, 2);
	int subresults=priya.sub(10, 2);
	priya.multi(subresults, subresults);
}	
	
	
	
	
	
	
	
	
	
	
}
