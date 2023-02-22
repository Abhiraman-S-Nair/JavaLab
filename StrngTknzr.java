package LabExam;

import java.util.*;

public class StrngTknzr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the elemnts separated by a space: ");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str, " ");
		while(st.hasMoreTokens())
		{
			String tmp=st.nextToken();
			n=Integer.parseInt(tmp);
			sum+=n;
		}
		System.out.print("Sum of intgers is: "+sum);
		sc.close();
	}
}
