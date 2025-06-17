import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	 int rev=0;
	 int org=n;
	while(n!=0){
	    int rem=n%10;
	    rev=rev*10+rem;
	    n=n/10;
	}
	if(org==rev){
	    System.out.println("it is a palindrome number");
	}
	else{
	     System.out.println("it is not a palindrome number");
	}
	}
}