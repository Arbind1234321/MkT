package StringBasic;
@FunctionalInterface
public interface inter {
	
	
	 int add(int a, int b);  // Single abstract method

	    // You can also have default or static methods
	    default int subtract(int a, int b) {
	        return a - b;
	    }

	    static int multiply(int a, int b) {
	        return a * b;
	    }

}
