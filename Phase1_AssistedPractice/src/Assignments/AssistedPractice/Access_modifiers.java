package Assignments.AssistedPractice;
class C1 {
	public int x = 10;
	protected int y = 56;
	int z = 12;
	private int a = 89;
	
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
}
public class Access_modifiers {

	public static void main(String[] args) {
		C1 c = new C1();
		c.meth1();

	}

}
