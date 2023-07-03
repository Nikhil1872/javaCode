//Merged String such that
//str1="ace"
//str2="bdf"
//output="abcde"


//****************code**************************

class Solution {
    public String mergeAlternately(String word1, String word2) {

	String str="";
	int l1=word1.length();
	int l2=word2.length();
	
	if(l1>l2)
	{
            int i=0;
	    for(i=0;i<l2;i++)
	        str=str+word1.charAt(i)+word2.charAt(i);
	    
	    for(int j=i;j<l1;j++)
	       str=str+word1.charAt(j);
	}	
	if(l1<l2)
	{
            int i=0;
	    for(i=0;i<l1;i++)
	        str=str+word1.charAt(i)+word2.charAt(i);
	
	    for(int j=i;j<l2;j++)
	       str=str+word2.charAt(j);
	}
      if(l1==l2)
      {
       for(int i=0;i<l1;i++)
	        str=str+word1.charAt(i)+word2.charAt(i);
      }
     return str;
  
    }
}
