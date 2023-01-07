package Class10;
import java.util.*;
public class Cabservice
{
	String taxino;
	String name;
	int d;
	Cabservice()
	{
		taxino="0";
		name="";
		d=0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of passenger: ");
		name=sc.nextLine();
		System.out.println("Enter the taxi number: ");
		taxino=sc.next();
		System.out.println("Enter the distance travelled: ");
		d=sc.nextInt();
		sc.close();
	}
	void calculate()
	{
		//double bill=1.0d;
		if(d<=1)
			System.out.println(d*15);
		else if(d>1 && d<=5)
			System.out.println(d*30);
		else if(d>5 && d<=10)
			System.out.println(d*35);
		else if(d>10 && d<=20)
			System.out.println(d*40);
		else if(d>20)
			System.out.println(d*45);
		
		
	}
	static Cabservice A=new Cabservice();
	void display()
	{
		
		
		System.out.println("Taxi No.\tName\t\tDistance(in km.)\tBill");
		System.out.print("\n"+taxino+"\t\t"+name+"\t\t"+d+"\t\t");
		A.calculate();
	}
	public static void main(String args[])
	{
		A.input();
		A.display();
		
	}
}
