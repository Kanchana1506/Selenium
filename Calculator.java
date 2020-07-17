package week1.day2;

public class Calculator {

	
	public int add(int num1, int num2)
	{
		int total;
		total = num1 + num2;
		return total;
	}
	
	public double sub(double num3, double num4)
	{
		
		double total;
		total = num3 - num4;
		return total;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		int a = cal.add(10, 7);
		System.out.println ("addition total is " + a);
		
		System.out.println ("difference is " + cal.sub(29.8, 10.1));
		
	}

}
