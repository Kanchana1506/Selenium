package week1.day1.assignments;



public class PrimeNumber {

	

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	

	public static void main(String[] args) {
int input = 13;
int count = 0;

for ( int i = 1; i <= input ; i++)
{
if ( input % i == 0)
	count ++;

}

if (count == 2 )
	System.out.println("prime number");
else
	System.out.println("Not a prime number");
   }

}