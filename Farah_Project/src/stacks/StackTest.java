package stacks;

public class StackTest {
    public static void main(String args[]){
        StackInterface<String> stack1 = new ArrayStack<>();
        stack1.push("Issam");
        stack1.push("Ahmed");
        stack1.push("Ali");
        
        //System.out.println(stack1.peek());
        //stack1 = reverseStack(stack1);
        //System.out.println(stack1.peek());
        stack1 = printStackElements(stack1);
        System.out.println(stack1.peek());
       
    }
    
    /* This method reverses the order in the stack s1. */
    public static StackInterface<String> reverseStack(StackInterface<String> s1){
        StackInterface<String> s2 = new ArrayStack<>();
        while(!s1.isEmpty()){
            s2.push( s1.pop());
        }
        //now s1 is empty and s2 has the stack elements in revese order
        return s2;
    }
    
    /* This method prints all stack elements in the same order as in the stack. */
    public static StackInterface<String> printStackElements(StackInterface<String> s){
        StackInterface<String> t = new ArrayStack<>();
        /* The following loop prints the elements */
        while(!s.isEmpty()){
            String theString = s.pop();
            System.out.println(theString);
            t.push( theString);
        }
        
        s=reverseStack(t);
        return s;
        /*while(!t.isEmpty()){
            String theString = t.pop();
            s.push( theString);
        }*/
        
    }
}
