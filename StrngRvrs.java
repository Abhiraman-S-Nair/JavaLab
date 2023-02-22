package LabExam;

import java.io.*;
import java.util.*;

public class StrngRvrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str, rev="";
		str=sc.nextLine();
		char[] arr = str.toCharArray();
		
		for (char c:arr)
		{
			rev=c+rev;
		}
		System.out.println("Original: "+str+"\nReversed: "+rev);
	}

}
