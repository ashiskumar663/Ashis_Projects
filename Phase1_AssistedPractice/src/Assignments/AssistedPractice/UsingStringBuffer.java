package Assignments.AssistedPractice;
import java.io.*;

class UsingStringBuffer {

	public static void main(String[] args) {
		 StringBuffer s = new StringBuffer("JungleBook");

	     // Getting the length of the string
	     int p = s.length();

	     // Getting the capacity of the string
	     int q = s.capacity();

	     // Printing the length and capacity of
	     System.out.println("length of string JungleBook="
	                     + p);
	     System.out.println(
	         "Capacity of string JungleBook=" + q);

	}

}