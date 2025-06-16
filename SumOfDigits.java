import java.util.*;
public class SumOfDigits
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	 int sum=0;
	 int n=sc.nextInt();
	 while(n!=0){
	     int rem=n%10;
	     sum+=rem;
	     n=n/10;
	 }
	 System.out.println(sum);
	}
}