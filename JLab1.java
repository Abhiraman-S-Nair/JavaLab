package test;

import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Even extends Thread
{
	String evenwrite;
	String write;
	String len1;
	String[] w1;
	int l1;
	
	Even (String s)
	{
		write=s;
		w1 = write.split("\\W+",0);
		l1=w1.length;
		len1=Integer.toString(l1);
		evenwrite=write+" "+len1+" T1\n";
		System.out.println(evenwrite);
	}

	public void run()
	{
		BufferedReader freader;
		try 
		{
			 
	        FileWriter fWriter = new FileWriter(
	            "C:\\Users\\abhir\\OneDrive\\Desktop\\even.txt",true);
	        fWriter.write(evenwrite);
	        fWriter.close();
	        
		}catch (IOException e) {System.out.println("Error");}
		
		try
		{
			freader = new BufferedReader(new FileReader(
					"C:\\Users\\abhir\\OneDrive\\Desktop\\even.txt"));
			String line = freader.readLine();
			
			System.out.print(line);
		
			/*while (line!=null)
			{
				System.out.println(line);
			}
			line = freader.readLine();*/
		}catch (IOException e) {System.out.println("Error");}
	}
}

class Odd extends Thread
{
	String oddwrite;
	String write;
	String[] w2;
	String len2;
	int l2;
	
	Odd (String s)
	{
		write=s;
		w2= write.split("\\W+",0);
		l2=w2.length;
		len2=Integer.toString(l2);
		oddwrite=write+" "+len2+" T2\n";
		System.out.println(oddwrite);
	}
	
	
	public void run()
	{
		BufferedReader freader;
		try 
		{
	        FileWriter fWriter = new FileWriter(
	            "C:\\Users\\abhir\\OneDrive\\Desktop\\odd.txt",true);
	        
	        fWriter.write(oddwrite);
	        fWriter.close();
	        
		}catch (IOException e) {System.out.println("Error");}
		
		
		try
		{
			freader = new BufferedReader(new FileReader(
					"C:\\Users\\abhir\\OneDrive\\Desktop\\odd.txt"));
			String line = freader.readLine();
			
			System.out.print(line);
		
			/*while (line!=null)
			{
				System.out.println(line);
			}
			line = freader.readLine();*/
		}catch (IOException e) {System.out.println("Error");}
		
	}
}

public class JLab1 {
	public static void main(String args[])
	{
		BufferedReader freader;
		
		try
		{
			freader = new BufferedReader(new FileReader(
					"C:\\Users\\abhir\\OneDrive\\Desktop\\test.txt"));
			String line = freader.readLine();
			
			//System.out.print(line);
		
			while (line!=null)
			{
				String[] words = line.split("\\W+",0);
				
				//System.out.print(words);
				/*for (int i=0; i<words.length; i++)
				{
					System.out.println(words[i]);
				}*/
				
				if ((words.length)%2==0)
				{
					Even evn = new Even(line);
					evn.start();
				}
				else
				{
					Odd odd = new Odd(line);
					odd.start();
				}
				line = freader.readLine();
			}
			
			
		}catch(IOException e) {}
	}

}
