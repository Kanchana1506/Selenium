package week1.day2.assignment;

import java.util.Arrays;


public class MissingElement {
	public static void main(String[] args) 
	{

		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		
		// Sort the array	
			Arrays.sort(arr);
			
	System.out.println("sorted order: " + Arrays.toString(arr));
	System.out.println("length: " + arr.length);	
		
//	loop through the array (start i from arr[0] till the length of the array)
	for (int i = 0; i<arr.length; i++ )
	{		
//		check if the iterator variable is not equal to the array values respectively
		if( arr[i+1]  != arr[i]+1) 
	{
			//				print the number
			System.out.println("The element is " + (arr[i] + 1));
			
			//once printed break the iteration
			break;
	}
			
	}	
		}
}

