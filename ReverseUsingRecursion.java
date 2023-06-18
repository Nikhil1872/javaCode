public class Main
{
	public static void main(String[] args){
		reverse(123);		 
	}
	static int rev=0;
	static int m=0;
 public static int reverse(int n)
	 {
	      m=n%10;
	     rev=rev*10+m;
	     if(n<10)
	      return rev; 
	     return recur(n/10);
	   
	 }
}

