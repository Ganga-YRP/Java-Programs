class Stack{
    int []arr=new int[5];
    int top=-1;
    void push(int i){
    if(top==arr.length-1){
        System.out.println("stack is full");
    }
    else{
        top++;
        arr[top]=i;
    }
    }
    void pop(){
    if(top==-1){
        System.out.println("stack is empty");
    }
    else{
        System.out.println("deleted element is"+arr[top]);
        top--;
    }
    }
    void peek(){
    if(top==-1){
        System.out.println("stack is empty");
    }
    else{
        System.out.println("the element is"+arr[top]);
    }
    }
    void display(){
    for(int i=0;i<arr.length;i++){
    }
    System.out.println(arr[top]);
    }
}
public class Main19
{
	public static void main(String[] args) {
	    Stack st=new Stack();
     st.push(1);
     st.push(2);
     st.push(3);
     st.pop();
     st.peek();
     st.display();
	}
}