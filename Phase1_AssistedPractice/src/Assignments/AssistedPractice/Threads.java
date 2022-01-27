package Assignments.AssistedPractice;

public class Threads extends Thread
{
	public void run()
	{  
		for(int i=1;i<=5;i++)
		{  
		   try
		   {  
			   Thread.sleep(500);  
		   }
		    catch(Exception e)
		   {
			   System.out.println(e);
		   }  
		   System.out.println(i);  
		  }  
	   }  
		 
	public static void main(String args[])
	{  
		
		 Threads t1=new Threads();  
		 Threads t2=new Threads();  
		 Threads t3=new Threads();  
		 t1.start();  
		 
		 try
		 {  
			 t1.join();  
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }  
		  
		 t2.start();  
		 t3.start();  
		 }  
		}  