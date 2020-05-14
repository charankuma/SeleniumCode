package Cons;
//this
//Super
//we can use super or this only in constructor not in other m ethods
/*  Super(),this()..These are Constructor calls to call parent or current object constructor
 * These two are mentioned within the Constructor and not in the method
 * super,this these are keywords to call current object or Parent object method or instance variables.
 * These can be used anywhere not restricted to Constructors
 * 
 */


//This program is to differnate local and Instance variables ofcurrent object by using this keyword

/*public class Test2 {
	
	int i;
	int j;
	
	Test2()
	{
	System.out.println("Call");
	}
	
	Test2(int i,int j)
	{
	this();
		this.i=i;
		this.j=j;
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 t2=new Test2(20,30);
	}

}
*/
//This program for current or parent class constructor calls using Super() and this()
public class Test2 extends Test1 {
	
	int i;
	int j;
	Test2()
	{
		super();
	System.out.println("asdad");
	System.out.println(super.st);
	}
	
	Test2(int i,int j)
	{
		this();
		this.i=i;
		this.j=j;
		System.out.println("adsas");
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 t2=new Test2(20,30);
}
}




