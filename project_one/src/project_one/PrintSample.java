package project_one;

public class PrintSample {
	
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of "+a+" and "+b+" = "+sum);
	}
	public int multiply(int a, int b, int c) {
		int product = a*b*c;
		return product;
	}
	public static void main(String[] args) {
		PrintSample obj = new PrintSample();
		obj.add(10,20);
		System.out.println("Product of 2, 10 and 5 = "+obj.multiply(2,10,5));
	}
}
