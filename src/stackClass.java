import java.util.Stack;

public class stackClass {
    public static void main(String[] args){
        Stack<Integer> stackOne = new Stack<>();
        for(int i=1; i<=5; i++){
            stackOne.add(i);
        }
        System.out.println("Stack is: "+ stackOne);
        stackOne.push(6);
        System.out.println("Push ofter stack: "+ stackOne);
        stackOne.pop();
        System.out.println("Pop ofter stack: "+ stackOne);

        System.out.println("Search of the stack: "+ stackOne.search(2));
        stackOne.peek();
        System.out.println("Peek of the stack: "+ stackOne);

    }
}
