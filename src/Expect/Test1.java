package Expect;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10/2);
System.out.println(10+3);
System.out.println(10-3);
try {
System.out.println(10/0);
}
catch(NullPointerException e)
{
System.out.println("Not Handled");
}
catch(ArithmeticException e)
{
	System.out.println("Haandled perfectly");
}
catch(Exception e)
{
	System.out.println("Handled");
}
	System.out.println(10+20);	


		
	}

}
