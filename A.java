package p1;
import java.util.Scanner;
public class A
{
	public String m1()
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter String" );
	 String s=sc.nextLine();
	 System.out.println("enter 2 String");
	 String s1=sc.nextLine();
	 String s2=s.concat(s1);
	 String s3=s2.toUpperCase();
	 return s3;
	 
	}

}