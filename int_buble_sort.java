package Class10.APC_Array_prog;
import java.util.*;
public class int_buble_sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[15];int i=0,m;
		System.out.println("Enter 15 integers");
		for(i=0;i<15;i++)
		{
			A[i]=sc.nextInt();
		}
		//Bubble sort
		for(i=0;i<15;i++)
		{
			for(int j=0;j<15-i-1;j++)
			{
				if(A[j]>A[j+1])
				{
					m=A[j];
					A[j]=A[j+1];
					A[j+1]=m;
				}
			}  
		}
		
		System.out.println("Sorted array: ");
		for(i=0;i<15;i++)
			System.out.println(A[i]);
	}//end main()
}//end class
