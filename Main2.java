import java.util.*;
public class Main2
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
	for(i=0;i<a.length;i++){
	if(a[i]%2==0){
	    even+=1;
	}
	else{
	    odd+=1;
	}
	}
	    System.out.println("even number count is"+even);
	    System.out.println("odd number count is"+odd);
	
	}
}