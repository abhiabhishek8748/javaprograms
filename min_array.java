/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static int min(int arr[])
    {
        int  min1 = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min1<arr[i]){
                min1 = min1;
            }
            
        }
        return min1;
    }
	public static void main (String[] args) {
	    int a[] = {12,23,34,45,55};
	    System.out.println(min(a));
	}
}