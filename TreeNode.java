class Node{
    int data;
    Node right;
    Node left;
    Node(int n){
        this.data=n;
        this.left=null;
        this.right=null;
    }
}
public class TreeNode
{
	public static void main(String[] args){
	    Node a=new Node(1);
	    Node b=new Node(2);
	    Node c=new Node(3);
	    a.left=b;
	    a.right=c;
	    System.out.println(a.data);
	    System.out.println(a.left.data);
	    System.out.println(a.right.data);
	    
	}
	
}