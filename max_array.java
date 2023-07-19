/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		int max = 0;
		for(int i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);		
		    
		}
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i]>max)
		    {
		       max = a[i];
		    }
		}
		 System.out.println("Maximum is  " +max);
	}
}