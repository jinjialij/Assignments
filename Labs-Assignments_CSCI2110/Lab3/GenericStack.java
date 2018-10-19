import java.lang.reflect.Array;
import java.util.ArrayList;
public class GenericStack <T> {
    //attribute
    private ArrayList<T> stack;

    //constructor
    public GenericStack(){
        stack=new ArrayList<T>();
    }

    //getter

    public int getSize() {
        return stack.size();
    }

    //peek method
    public T peek() {//return the top value
        if(!stack.isEmpty())
            return stack.get(stack.size()-1);
        else {
            System.out.println("Stack is Empty.");
            return stack.get(0);
        }
    }

    //pop method:return the top value and clean
    public T pop() {//return the top value
        if(!stack.isEmpty()) {
            T hold = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return hold;
        }
        else {
            System.out.println("Stack is Empty.");
            return null;
        }
    }

    //push method: add in the top
    public void push(T input){
        if(stack.isEmpty())
            stack.add(0,input);
        else
            stack.add(stack.size(),input);
    }

    //boolean method:return true if stack is not empty
    public boolean isEmpty(){
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
