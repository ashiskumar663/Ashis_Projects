package Assignments.AssistedPractice;
class Outer
{
	int a ;
	public static void show() {
}

	class Inner
	{
		public void display()
		{
			System.out.println("in display");
		}
		}
	}
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Outer obj = new Outer();
				obj.show();
				Outer.Inner obj1 = obj.new Inner();
				obj1.display();

	}

}
