package Demo;

public class A {

	public void m1()
	{
		System.out.println("git m1 method");
	}
	
	public void m2()
	{
		System.out.println("git m2 method");
	}
	
	public void m3()
	{
		System.out.println("git m3 method");
	}
	
	public void m4()
	{
		System.out.println("git m4 method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		
		A a=new A();
		 a.m1();
		 a.m2();
		a.m3();
		a.m4();
		
	}
}
