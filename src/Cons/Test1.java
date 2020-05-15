package Cons;

//Constructor:Same as Class name and no return type
//Constructor can support all modifiers such as public,private,default and protected
//Constructor are of 2 types..namely such as Default and parameterized Constructor
//Constructor are called when ever we create an object and no need to be called explicitly
//To perform initalization of an object
//this..Means Current object
public class Test1 {
	
/*private	Test1()
	{
		System.out.println("Private");
	}*/
/*protected	Test1()
{
	System.out.println("Private12");
}*/

/*public Test1()
{
	System.out.println("public");
}*/

	int i;
	String st;
	
	Test1()
	{
		System.out.println("Parent asdasf");
	}
Test1(int i,String vt)
{
this.i=i;
this.st=vt;
System.out.println("ParentConstructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 ts=new Test1(10,"charan");
		System.out.println(ts.i);
		System.out.println(ts.st);
		

	}

}
