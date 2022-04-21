package week4.day1.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
    int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> dup = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					dup.add(arr[i]);
				}
			}
			
		}
		System.out.println(dup);

	}

	}


