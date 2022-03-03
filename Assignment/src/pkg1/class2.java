package pkg1;

public class class2 {   // ((((10+2)-2)*2)/2)

	public int sum(int a,int b) {
		
	int c;
	c=a+b;
	System.out.println("sum of results "+c);	
	return c;
	}
	
	public int sub(int c,int d) {	
		int e;
		e=c-d;
		System.out.println("sub of results "+e);	
		return e;
		}
		
	public int multi(int f,int g) {	
		int h;
		h=f*g;
		System.out.println("multi of results "+h);	
		return h;
		}
	
	public void div(int i,int j) {	
		int k;
		k=i/j;
		System.out.println("div of results "+k);
	}
	
	public static void main(String[] args) {
		
	System.out.println("added new one");
		
		class2 obj =new class2();
		int sumresults=obj.sum(10, 2);
		int subresults =obj.sub(sumresults,2);
		int multiresults=obj.multi(subresults, 2);
		obj.div(multiresults, 2);
		
		
		
	}
	
	
	
	
	
	
	
}
