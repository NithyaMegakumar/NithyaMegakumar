package week1.day2.homeAssignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,7,6,8};
        //Sorting the array
		Arrays.sort(num);
		
		for (int i=1; i <= num.length; i++) {

			if(i != num[i-1])
			{
				System.out.println(i);			
				break;

			}

		}

	}

}
