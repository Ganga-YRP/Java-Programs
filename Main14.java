import java.util.*;
public class Main14
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    for(int i=0;i<a.length();i++){
	        char b=a.charAt(i);
	        if(Character.isDigit(b)==false){
	            System.out.println("not digits");
	            break;
	        }
	    }
	        System.out.println("digits");
	    
}
}