package LabExam;

import java.util.*;
class Quicksort
{
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[low];
		/*
		 * int i = (low - 1); for (int j = low; j <= high - 1; j++) { if (arr[j] <
		 * pivot) { i++; swap(arr, i, j); } }
		 */
		int start=low;
		int end=high;
		
		while(start<end)
		{
			while(arr[start]<=pivot)
			{
				start++;
			}
			while(arr[end]>=pivot)
			{
				end--;
			}
			if (start<end)
			{
				swap(arr,start,end);
			}
		}
		/*
		 * swap(arr, i + 1, high); return (i + 1);
		 */
		swap(arr,low,end);
		return end;
		
	}
	
	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high)
		{	
			int pi = partition(arr, low, high);	
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}	
	
	static void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for (int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}

