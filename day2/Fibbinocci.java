

package week1.day2;

public class Fibbinocci {

 public static void main(String[] args) {
	int firstNum = 0; int secNum = 1; int sum = 0;
	System.out.println(firstNum);
	System.out.println(secNum);
	for (int count = 10;count>0;)
	{
		
		sum= firstNum+secNum;
		firstNum = secNum;
		secNum = sum;
		if(sum <56) {
		System.out.println(sum);
		
	}
		count = count - 1;
	}
	 
}
}
