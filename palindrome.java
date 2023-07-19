import java.io.*;

class GFG {
	public static void main (String[] args) {
		int num=3553,temp=num,rem=0,a;
		while(num>0)
		{
		    a = num%10;
		    rem = rem*10+a;
		    num /= 10;
		    
		}
		if(temp==rem){
		    System.out.println("It is Palindrome....");
		    
		}else
		{
		    System.out.println("It is not Palindrome");
		}
	}
}