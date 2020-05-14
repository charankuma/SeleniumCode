//Interface we have to use implements
//Abstracts class we have to use extends..Since normal class extends the Abstract one
public class Test5 implements Test4 {

	

	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Ex1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Ex2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Ex3");
	}
	
	public static void main(String[] args) {
		
		Test5 t2=new Test5();
		
		t2.m1();
		t2.m2();
		t2.m3();

}
}