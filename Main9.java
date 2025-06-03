import java.util.*;
public class Main9
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=0;
	int m=sc.nextInt();
	temp=n;
	n=m;
	m=temp;
	System.out.println(n+" "+m);
}
}