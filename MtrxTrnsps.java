package LabExam;

import java.io.*;
import java.util.*;

public class MtrxTrnsps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the order of the matrix: ");
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		int org[][] = new int[m][n], trnsps[][] = new int[n][m];
		
		System.out.println("Enter the elements for the matrix: ");
		for(int i=0; i<m; i++)
		{
			for (int j=0; j<n; j++)
			{
				org[i][j]=sc.nextInt();
			}
		}
		/*
		 * for(int i=0; i<m; i++) { for (int j=0; j<n; j++) { trnsps[i][j]=org[j][i]; }
		 * }
		 */
		
		System.out.println("Original Matrix is: ");
		for(int i=0; i<m; i++)
		{
			for (int j=0; j<n; j++)
			{
				System.out.print(org[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Transpose Matrix is: ");
		for(int i=0; i<n; i++)
		{
			for (int j=0; j<m; j++)
			{
				System.out.print(org[j][i]+" ");
			}
		}
	}

}
