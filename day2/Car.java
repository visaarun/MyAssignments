package week1.day2;



public class Car {
	
	public void printCarBrand() {
		
		System.out.println("Kia");
		
	}
	
	public String getCarColor() {
		return "red" ;
	}
	
	public int getCarEngineNumber() {
		return 156 ;
	}
	public int subtraction(int a ,int b)
	{
		
		int c = a - b;
		return c;
	}
	
	public int division(int a ,int b)
	{
		int c = a/b;
		return c;
	}
	
	public int multiplication(int a ,int b)
	{
		int c = a*b;
		return c;
	}
	
	
	public static void main(String[] args) {
		Car myObj = new Car();
	    myObj.printCarBrand();
	    String getCarColor =myObj.getCarColor();
	    int getCarEngineNumber = myObj.getCarEngineNumber();
	    System.out.println(getCarColor);
	    System.out.println(getCarEngineNumber);
	    int subtraction =  myObj.subtraction(10,5);
	    int division =  myObj.division(10,5);
	    int multiplication =  myObj.multiplication(10,5);
	    System.out.println(subtraction);
	    System.out.println(division);
	    System.out.println(multiplication);
	  

}

}


