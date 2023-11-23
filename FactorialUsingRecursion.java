public class Main
{
	public static void main(String[] args) {
		System.out.println(fact(6));
	}
	
  public static int fact(int n)
	 {
            if (n == 0 || n == 1) 
              return 1;           // Base case: Factorial of 0 and 1 is 1
            else 
            // Recursive call: Factorial of n = n * factorial of (n-1)
            return n * factorial(n - 1);
	 }
	 
}
