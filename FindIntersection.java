package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		
		// Pseudo Code
		
		 // a) Declare An array for {3,2,11,4,6,7};	 
		Integer[] arr1 = {3,2,11,4,6,7};
		//List<Integer> number1 = new ArrayList<Integer>();
		 // b) Declare another array for {1,2,8,4,9,7};
		Integer[] arr2 = {1,2,8,4,9,7};
		Set<Integer> arr3 = new LinkedHashSet<Integer>();
 		 //c) Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr1.length; i++) {
	
		// d) Declare a nested for another array from 0 to array length
			for (int j = 1; j < arr2.length; j++) { 
	
		 // e) Compare Both the arrays using a condition statement
		 if(arr1[i]==arr2[j]) {
		//  f) Print the first array (shoud match item in both arrays)
		 arr3.add(arr1[j]);
		 }
		}
	}
		System.out.println("Intersection: " +arr3);
}
}
