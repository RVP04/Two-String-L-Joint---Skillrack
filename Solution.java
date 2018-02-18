import java.util.*;
public class Hello {

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    
	    //getting input from the user
	    String stringone = sc.next();
	    String stringtwo = sc.next();
	    
	    //finding the length of the strings
	    int lengthone = stringone.length();
	    int lenghttwo = stringtwo.length();
	    
	    //if first last letter matches with second string starting with first string
	    if(stringone.charAt(lengthone-1)==(stringtwo.charAt(0)))
	    {
	        for(int i = 0;i<lengthone-1;i++)
	        {
	            for(int j=0;j<lenghttwo;j++)
	            {
	                if(j==0)
	                    System.out.print(stringone.charAt(i));
	                else
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	        //print first string upto last character -1
	        //print the second string
	        System.out.print(stringtwo);
	    }
	    //if second string last letter match with first string letter then start with second string
	    else 
	    {
	        for(int i =0;i<lenghttwo-1;i++)
	        {
	            for(int j=0;j<lengthone;j++)
	            {
	                if(j==0)
	                    System.out.print(stringtwo.charAt(i));
	                else
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	        System.out.print(stringone);
	    }
	    

	}
}
