package Assignments.AssistedPractice;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		int a[]=new int[10];
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter 10 Numbers");
	    for(int i =0;i<10;i++)
	    {
	    	a[i]=in.nextInt();
	    	
	    }
	    System.out.println("Unsolved array");
	    for(int i=0;i<10;i++)
	    {
	    	System.out.println(a[i]+",");
	    }
	   
		for (int i=0;i<10-i-1;i++)
	    {
	    	for(int j=0;j<10-i-1;j++)
	    	{ 
	    		if (a[j]>a[j+1])
	    		{
	    			int t =a [j];
	    			a[j]=a[j+1];
	    			a[j+1]=t;
	    		}
	    	}
	    }
	    System.out.println("\n Sorted element are:");
	    for(int i=0;i<10;i++)
	    {
	    	System.out.println(a[i]+",");
	    }
	}

}
