package LabExam;

import java.util.*;

public class MthdOvrldng extends Shapes {

	public static void main(String[] args) {
		Shapes obj = new Shapes();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n1 for Circle\n2 for Rectangle\n3 for Triangle");
		int optn=sc.nextInt();
		
		if (optn==1)
		{
			double ar=obj.area(1);
			System.out.println("Area: "+ar);
		}
		else if (optn==1)
		{
			double ar=obj.area(3,4);
			System.out.println("Area: "+ar);
		}
		else if (optn==1)
		{
			double ar=obj.area(3,4,5);
			System.out.println("Area: "+ar);
		}
		else
		{
			System.out.println("Exiting.....");
		}
	}
}

class Shapes
{
	public double area(double r)
	{
		double area=3.14*r*r;
		return area;
	}
	
	public double area(double l, double b)
	{
		double area=l*b;
		return area;
		
	}
	
	public double area(double a, double b, double c)
	{
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
}
