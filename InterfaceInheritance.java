package LabExam;

import java.util.*;

interface ADDSUB 
{
	public void add(double x, double y);
	public void sub(double x, double y);
}

interface MULTDIV 
{
	public void mult(double x, double y);
	public void div(double x, double y);
}

interface Calc extends ADDSUB, MULTDIV 
{
	public void mult(double x, double y);
	public void div(double x, double y);
}

public class InterfaceInheritance implements Calc
{
	public void add(double x, double y)
	{
		double result = x+y;
	}
	
	public void sub(double x, double y)
	{
		double result = x-y;
	}
	
	public void mult(double x, double y)
	{
		double result = x*y;
	}
	
	public void div(double x, double y)
	{
		if (y!=0)
		{
			double result = x-y;
		}
		else
		{
			String result = "\nDivison by 0 is not possible";
		}
	}
}
