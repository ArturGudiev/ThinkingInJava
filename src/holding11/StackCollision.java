package holding11;

/**
 * Created by 1 on 18.12.2016.
 */
public class StackCollision {
    public static void main(String[] args) {
        holding11.Stack<String> stack = new holding11.Stack<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        java.util.Stack<String> stack2 = new java.util.Stack<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack2.push(s);
        }
        while(!stack2.empty()){
            System.out.print(stack2.pop() + " ");
        }
    }
}
