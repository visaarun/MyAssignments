package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] a = {1,2,3,4,7,6,8};
	     Arrays.sort(a);
        
      
 


        	int index=1;
        	int firstNumber=a[0];
        	while(index<a.length) {


        	if(a[index]-firstNumber!=1) {
        	System.out.println("Missing Number:"+(firstNumber+1));
        	}
        	firstNumber=a[index];

        	index++;
        	}
        	

	
				
				
		

	}

}