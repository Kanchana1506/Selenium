package week1.day2.assignment;

import java.util.Arrays;

public class SecondLargest {
	
		public static void main(String[] args) {

			// Here is the input
			int[] data = {3,2,11,4,6,7};

			
			/*
			 Pseudo Code:
			 1) Arrange the array in ascending order
			 2) Pick the 2nd element from the last and print it
			 */
			int len= data.length;
			System.out.println("number of elements: " + len);
			
			Arrays.sort(data);
			System.out.println("sorted order: " + Arrays.toString(data));
			
			int a= len - 2;
			System.out.println(data[a]);
			
				
			}
			
			
		}

		
	
	
	