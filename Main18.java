import java.util.*;
public class Main18
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String b="";
	    for(int i=0;i<a.length();i++){
	        char ch=a.charAt(i);
	        if(Character.isLowerCase(ch)){
	            char c=Character.toUpperCase(ch);
	            b=b+c;
	        }
	        else if(Character.isUpperCase(ch)){
	            char c=Character.toLowerCase(ch);
	            b=b+c;
	        }
	        }
	        System.out.println(b);
	    }
}