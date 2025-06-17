import java.util.*;
public class Armstrong
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int count=0;
	    int m=n;
	    int l=n;
	    double sum=0;
	    while(n!=0){
	        int rem=n%10;
	        count=count+1;
	        n=n/10;
	    }
	    while(m!=0){
	        int rem=m%10;
	        sum=sum+Math.pow(rem,count);
	        n=n/10;
	    }
	    if(l==sum){
	        System.out.println("Armstrong number");
	    }
	    else{
	        System.out.println("not armstrong number");
	    }
	}
}