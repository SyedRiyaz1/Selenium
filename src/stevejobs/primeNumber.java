package stevejobs;

import java.util.Scanner;

public class primeNumber 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int  n= s.nextInt();
		System.out.println("Enter number");
		 int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			System.out.println("Not a prime number");
			flag=1;
			}
		
		else
		{
			flag=0;
		System.out.println("it is prime number");	
		}
    s.close();
	
		}
		}
}
