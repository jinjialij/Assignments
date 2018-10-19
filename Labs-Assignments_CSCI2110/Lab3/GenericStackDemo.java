import java.util.Scanner;
import java.util.ArrayList;
public class GenericStackDemo{
    public static void main(String[]args){
        GenericStack<String> stack1 = new GenericStack<String>();
        GenericStack<Integer> stack2 = new GenericStack<Integer>();
        Scanner kb=new Scanner(System.in);
        //let user input values in all stacks
        System.out.print("For String Stack:\nEnter a word (quit to end): ");
        String input=kb.next();
        while(!input.equalsIgnoreCase("quit")) {
            stack1.push(input);
            System.out.print("Enter a word (quit to end): ");
            input=kb.next();
        }
        System.out.print("\nFor Integer Stack\nEnter a postive integer(-1 to end):");
        int input2=kb.nextInt();
        while(input2!=-1){
            stack2.push(input2);
            System.out.print("Enter a postive integer(-1 to end):");
            input2=kb.nextInt();
        }

        //display all stacks
        System.out.println("String Stack Contents:");
        if(!stack1.isEmpty()){
            while (!stack1.isEmpty()){
                System.out.println(stack1.pop());
            }
        }
        else {
            System.out.println("String Stack is empty");
        }

        System.out.println("\nInteger Stack Contents:");
        if(!stack2.isEmpty()){
            while (!stack2.isEmpty()){
                System.out.println(stack2.pop());
            }
        }
        else {
            System.out.println("Integer Stack is empty");
        }
    }

    }