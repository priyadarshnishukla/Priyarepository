package pkg1;

public class class22 {   //((((10*2)-2)*2)+2)/2)
	
	
	public int multi(int a,int b) {
		
		int c;
		c=a*b;
		System.out.println("multi of results "+c);	
		return c;
		}

   public int sub(int c,int d) {
		
		int e;
		e=c-d;
		System.out.println("sub of results "+e);	
		return e;
		}

   public int sum (int g,int h) {
		
		int i;
		i=g+h;
		System.out.println("sum of results "+g);	
		return i;
		}
	
   public void div (int i,int j) {
		int k;
		k=i/j;
		System.out.println("div of results "+k);	
		
		}	
	
	public static void main(String[] args) {
		
	int result;
	class22 obj1 =new class22();
	result = obj1.multi(10, 2);
	result =  obj1.sub(result, 2);
	result =  obj1.multi(result, 2);
	result =  obj1.sum(result, 2);
	obj1.div(result, 2);
	//System.out.println("result of expression is " + result);
	}
	
	
	
	
	
	
	
	
	
	
	
}
