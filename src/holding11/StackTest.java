package holding11;

/**
 * Created by 1 on 18.12.2016.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
