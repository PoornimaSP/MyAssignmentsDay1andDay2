package week1.day2;

public class Car {
	
	public void printCarbrand()
	{
		System.out.println("My car's brand is BMW");
	}
	
	public String getCarColor()
	{
		return "Black is my Car color";
	}
	
	public int getCarNumberEngine()
	{
		return 2345;
	}
	
	public int subTwoNumbers(int a,int b)
	{
		return a-b;
	}
	
	public int addTwoNumbers(int a,int b)
	{
		return a+b;
	}
	public int mulTwoNumbers(int a,int b)
	{
		return a*b;
	}
	public int divTwoNumbers(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		Car obj= new Car();
		obj.printCarbrand();
		System.out.println(obj.getCarColor());
		String carColor=obj.getCarColor();
		System.out.println(carColor +" using a variable to capture the returned value instead of syso");
		System.out.println("The Engine number is"+obj.getCarNumberEngine());
				int c =obj.subTwoNumbers(60,10);
		System.out.println("The subtraction of two numbers is :" + c);		
		System.out.println("The addition of two numbers is :" + obj.addTwoNumbers(60,10));		
		System.out.println("The multiplication of two numbers is :" + obj.mulTwoNumbers(60,10));
		System.out.println("The division of two numbers is :" + obj.divTwoNumbers(60,10));
	}
	
}
