import java.util.*;
public class Main13
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int vowel=0;
	    int cons=0;
	    String a=sc.nextLine();
	    for(int i=0;i<a.length();i++){
	        char b=a.charAt(i);
	        if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
	            vowel+=1;
	        }
	        else{
	            cons+=1;
	        }
	    }
	    System.out.println(vowel);
	    System.out.println(cons);
}
}