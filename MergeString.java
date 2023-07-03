//Merged String such that
//str1="ace"
//str2="bdf"
//output="abcde"


//****************code**************************

public class Main
{
	public static void main(String[] args) {
		String hello1 ="ace";
		String hello2 ="bd";
		
		
		char [] arr1 = hello1.toCharArray();
		char [] arr2 = hello2.toCharArray();
		
		int l = arr1.length+arr2.length;
		String str="";
		int j=0;int k=0;

		for(int i=0;i<l;i++)
		{
		    if(j<arr1.length)
		    {
		        str=str+arr1[j];
		        j++;
		        
		    }
		    if(k<arr2.length)
		    {
		    str=str+arr2[k];
		    k++;
		    }
		    
		    i++;
		    
		}
		
		
		System.out.println(str);
	}
}
