package week1.day2;

import java.util.Arrays;
//int[] arr = {1,2,3,4,7,6,8};
// Sort the array	
// loop through the array (start i from arr[0] till the length of the array)
// check if the iterator variable is not equal to the array values respectively
// print the number
// once printed break the iteration
		
public class MissingElementInArrayAssign {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,7,6};

		// Sort the array	
		Arrays.sort(arr);
		int n=0;

		for (int i = 0; i < arr.length; i++)
		{
			n++;

			if(n != arr[i])
			{
				System.out.println("Missing element : " + n);
				break;
			}
		}
	}

	}


