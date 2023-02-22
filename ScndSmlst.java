package LabExam;

import java.util.*;
import java.io.*;

public class ScndSmlst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array: ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the elements for the array: ");
		for (int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int smlst=0, scndsmlst=0;
		for (int i=1; i<size; i++)
		{
			if (arr[i]<arr[smlst])
			{
				scndsmlst=smlst;
				smlst=i;
			}
		}
		System.out.println("Second smallest in the array is: "+arr[scndsmlst]);
	}

}
