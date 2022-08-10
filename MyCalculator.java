package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println("The addition of number 10, 15 and 20 is :"+ calc.add(10,15,20));
		System.out.println("The Subtraction of number 20 from 5 is:"+ calc.sub(20,5));
		System.out.println("The Multiplication of number 20 from 5 is:"+ calc.mul(20, 5));
        System.out.println("The Division of number 20 out 5 is:"+ calc.divide(20, 5));
	}

}
