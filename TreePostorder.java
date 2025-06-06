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
class tree{
    Node root;
    tree(){
        this.root=null;
    }
    void insert(int n){
    Node newnode=new Node(n);
    if(root==null){
        this.root=newnode;
    }
    else{
        Node curr=this.root;
        while(true){
            if(n>curr.data){
                if(curr.right==null){
                    curr.right=newnode;
                    break;
                }
                else{
                    curr=curr.right;
                }
                if(curr.left==null){
                    curr.left=newnode;
                    break;
                }
                else{
                    curr=curr.left;
                }
            }
        }
    }
    }
    void Postorder(Node root){
        if(root!=null){
            Postorder(root.left);
            Postorder(root.right);
			System.out.println(root.data);
        }
    }
        
    
}
public class TreePostorder
{
	public static void main(String[] args){
	   tree t=new tree();
	   t.insert(1);
	   t.insert(3);
	   t.insert(5);
	   t.Preorder(t.root);
	}
	
}