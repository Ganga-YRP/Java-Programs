import java.util.*;
public class Main3
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []a=new int[5];
	int even=0;
	int odd=0;
	int i=0;
	for(i=0;i<a.length;i++){
	    a[i]=sc.nextInt();
	}
	int sum=0;
	for(i=0;i<a.length;i++){
	    sum+=a[i];
	}
	System.out.println("sum is"+sum);
	}
}