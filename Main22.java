import java.util.*;
public class Main22{
    public static void main(String[] args){
        Stack st=new Stack<>();
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String a="";
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        st.push(ch);
    }
    for(int i=0;i<s.length();i++){
        a=a+st.pop();
    }
    System.out.println(a);
    }
}