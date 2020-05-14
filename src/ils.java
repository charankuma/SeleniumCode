//Instance Variable: They are the  variables whose variables are changing whenever we are creating the new object..Values will  
//be varied from object to object
//They are called using object
//Default Assignation is done by Jvm..Fpr string it is Null,Int it is zero
//static variables:If the variable values doesn't differ from object to objeect then we have to place it as static
//If a value of varaible is not varied object to object then it is not recommended to declare variable as instance variable.
//we have to declare such type of variable at class level using Static modifier.
//We can access static variables either by object reference or by class name but recommended to use class name
//
public class ils {

	int i=10;
	
	static String st;
	
	static int j=34;
	
	static int s;
	
	
	public static void main(String[] args) {
		
	//	ils sd=new ils();
		
		
//System.out.println(sd.i);
System.out.println(j);
System.out.println(st);
System.out.println(s);

	}

}
