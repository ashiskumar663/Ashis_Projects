package Assignments.AssistedPractice;
import java.util.Hashtable;
import java.util.Vector;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// Creating instances of the array,
        // vector and hashtable
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector<Integer>();
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
  
        // Adding the elements into the
        // vector
        v.addElement(1);
        v.addElement(2);
  
        // Adding the element into the
        // hashtable
        h.put(1, "Rakesh");
        h.put(2, "Ashis");
  
       
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

	}

}
