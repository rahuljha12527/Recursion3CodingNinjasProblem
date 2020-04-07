/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     
       public static void printSubsequece(String str,String outputSoFar){

    	if(str.length()==0){
    		System.out.println(outputSoFar);
    		return;
    	}


    	printSubsequece(str.substring(1),outputSoFar);
    	printSubsequece(str.substring(1),outputSoFar+str.charAt(0));
    	
    }
    public static void PrintSubsequece(String str){

    	printSubsequece(str,"");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    PrintSubsequece("xy");
	}
}
