package Practice;

public class MethodOverloading {
	

	    // Method 1: add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method 2: add three integers (different number of parameters)
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method 3: add two double values (different parameter type)
	    public double add(double a, double b) {
	        return a + b;
	    }
	public static void main(String[] args) {
		MethodOverloading calc = new MethodOverloading();

        System.out.println("add(int,int): " + calc.add(10, 20));
        System.out.println("add(int,int,int): " + calc.add(10, 20, 30));
        System.out.println("add(double,double): " + calc.add(5.5, 4.5));
    }
}
