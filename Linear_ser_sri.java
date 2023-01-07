package Class10.APC_Array_prog;
import java.util.*;
public class Linear_ser_sri
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,pos=-1,flag=0;
		String NM[]=new String[10];
		System.out.println("Enter the names of Students");
		for(i=0;i<10;i++) {
			NM[i]=sc.nextLine();
			NM[i].trim();
			NM[i]=NM[i].toUpperCase();
		}
		System.out.println("Enter a name to be searched: ");
		String nm=sc.nextLine();
		//linear search
		for(i=0;i<10;i++)
		{
			if(nm.equalsIgnoreCase(NM[i]))
				{
				flag=1;
				pos=i;
				break;
				}
		}
		
		if(flag==1)
			System.out.println("Name is found in "+(pos+1)+"th position");
		else
			System.out.println("Name Not found");
		//finding and printing names  with "SRI" 
				System.out.println("\nNames starting with \"SRI\": ");
				for(i=0;i<10;i++)
				{
					if(NM[i].startsWith("SRI")) {
					System.out.println(NM[i]);	
					}
				}
		sc.close();
	}//end main()
}//end class
