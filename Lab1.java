package test;

import java.util.*;
import java.lang.*;

class Lab1
{
	public static void main(String args[])
	{
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the max limit: ");
		max = sc.nextInt();
		
		for (int i=1; i<=max; i++)
		{
			if (i%3==1)
			{
				T1 t1 = new T1(i);
				Thread t = new Thread(t1);
				t.start();
			}
			else if (i%3==2)
			{
				T2 t2 = new T2(i);
				Thread t = new Thread(t2);
				t.start();
			}
			else
			{
				T3 t3 = new T3(i);
				Thread t = new Thread(t3);
				t.start();
			}
		}
	}
	
}

class T1 implements Runnable
{
	int num;
	T1 (int n)
	{
		num=n;
	}
	
	public void run()
	{
		System.out.println("T1 "+num);
	}
	 
}

class T2 implements Runnable
{
	int num;
	T2 (int n)
	{
		num=n;
	}
	
	public void run()
	{
		System.out.println("T2 "+num);
	}
}

class T3 implements Runnable
{
	int num;
	T3 (int n)
	{
		num=n;
	}
	
	public void run()
	{
		System.out.println("T3 "+num);
	}
}