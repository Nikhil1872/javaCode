public class Main
{
	public static void main(String[] args) {
		System.out.println(fact(6));
	}
	static int fac=1;
  public static int fact(int n)
	 {
	     fac=fac*n;
	     if(n==1)
	     return fac;
	     return fact(n-1);
	 }
	 
}
