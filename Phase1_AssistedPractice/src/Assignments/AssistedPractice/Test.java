package Assignments.AssistedPractice;

public class Test {

	int square(int num){
		   return num * num; // return a square value.
		 }
	public static void main(String[] args) {
		{
			  Test t = new Test();
			  
			// Call the method using object reference variable.
			  
			   int squareOfNumber = t.square(40); 
			     
			   System.out.println("Square of 40: " +squareOfNumber);
	}
	}
}
