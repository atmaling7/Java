class Example 
{
	String a ="Parent";

	void m1(){
		System.out.println("Hello");
	}

	Example(){
		System.out.println("Hello");
	}
}

class Demo extends Example
{
	String a = "CHILD";

	Demo(){
		System.out.println("super()");
	}

	public static void main(String[] args)
	{
		Demo obj = new Demo();

		obj.m1();
	}

	public void m1()
	{
		System.out.println("Method of child class");
		System.out.println(super.a);
		super.m1();
	}
}
