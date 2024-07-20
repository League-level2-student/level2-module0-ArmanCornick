package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"one","two","three","four","five"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "fat";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		//6. make an array of 50 integers

		int[] integers = new int[50];

		Random j = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for (int e=0; e < integers.length; e++) {
			integers[e] = j.nextInt(1000);
		}
		int x = integers[0];
		//8. without printing the entire array, print only the smallest number in the array
		for (int integer:integers) {
			if(integer<x) {
				x = integer;
			}
		}
		System.out.println(x);
		x = 0;
		//9 print the entire array to see if step 8 was correct
		for (int integer:integers) {
			if(integer>x) {
				x = integer;
			}
		}
		System.out.println(x);
		//10. print the largest number in the array.
	}
}
