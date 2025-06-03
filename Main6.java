import java.util.*;
public class Main6
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []a=new int[5];
	int i=0;
	for(i=0;i<a.length;i++){
	    a[i]=sc.nextInt();
	}
	int n=sc.nextInt();
	int flag=1;
	for(i=0;i<a.length;i++){
	    if(n==a[i]){
	        System.out.println("found at index"+i);
	        flag=0;
	        break;
	    }
	}
	    if(flag==1){
	        System.out.println("not found");
	    }
	    
	}
}