package week4.day1.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				//1) Arrange the array in ascending order
				Arrays.sort(data);
				System.out.println("sorted Array: "+Arrays.toString(data));
                //2) Pick the 2nd element from the last and print it
				int length = data.length;
				int i = data[length-2];
				System.out.println("2nd largest element is: "+i);
				
				
				 
				
				 
				
				

	}

}
