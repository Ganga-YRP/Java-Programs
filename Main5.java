import java.util.*;
public class Main5
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []a=new int[5];
	for(int i=0;i<a.length;i++){
	    a[i]=sc.nextInt();
	}
	int m=1;
     for(int i=0;i<a.length;i++){
         if(a[i]<m){
             m=a[i];
         }
     }
     System.out.println(m);
}
}