package pkg1;

public class student {

	int age;
	int roll_no;
	
	public void display1(){
		System.out.println("Welcome to all of you");
	}
	
	public void display2() {
	System.out.println("Automation is very easy");	
	}
	
	public static void main(String[] args) {
		
	student priya = new student();
	priya.age=30;
	priya.roll_no=1001;
	priya.display1();
	priya.display2();
	
	

	System.out.println(priya.age);
	System.out.println(priya.roll_no);	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
