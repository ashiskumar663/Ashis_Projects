package Assignments.AssistedPractice;
class Calc{
	int num1;
	int num2;
	int result;
	public Calc()//default
	{ 
		num1 = 5;
	    num2 = 7;
	    System.out.println("in constructor");
	}
	public Calc(int n)//parameterized
	{
		num1 = n;
		num2= n;
	}
	public Calc(double d,int n)
	{
		num1 =(int) d;
		num2 = n;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj = new Calc(8.9,7);
		System.out.println(obj.num1);
	}

}
