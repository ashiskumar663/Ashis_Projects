package Assignments.AssistedPractice;
import java.util.Arrays;
public class InsertionSort {
	public static int[] InsertionSort(int[]a)
	{
		for(int i=0;i<a.length;i++)
			{
			int j = i;
			while((j>0)&&(a[j-1]>a[j])) {
			int t =a[j];
			a[j]=a[j-1];
			a[j-1]=t;
			j--;
			}
			
			}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {2,8,5,1,4,1,9,6,3,10};
		a=InsertionSort(a);
		System.out.println(Arrays.toString(a));

	}

}
