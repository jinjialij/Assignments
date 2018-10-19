import java.util.Scanner;
public class GenericQueueDemo {
    public static void main(String[]args){
        GenericQueue <String> queue1 =new <String> GenericQueue();
        GenericQueue <Integer> queue2 =new <Integer> GenericQueue();

        Scanner kb=new Scanner(System.in);
        //let user input values in all queues, test enqueue
        System.out.print("For String Queue:\nEnter a word (quit to end): ");
        String input=kb.next();
        while(!input.equalsIgnoreCase("quit")) {
            queue1.enqueue(input);
            System.out.print("Enter a word (quit to end): ");
            input=kb.next();
        }

        System.out.print("\nFor Integer Queue:\nEnter a postive integer(-1 to end): ");
        int input2=kb.nextInt();
        while(input2!=-1){
            queue2.enqueue(input2);
            System.out.print("Enter a postive integer(-1 to end):");
            input2=kb.nextInt();
        }


        //display all contents in queue1 and queue2
        //test dequeue and peek method
        System.out.println("String Queue Contents:");
        if (queue1.size()==0){
            System.out.println(queue1.peek()+" (Notice: Empty queue)");
        }
        else{
            while(!queue1.isEmpty()){
                System.out.println(queue1.dequeue());
            }
        }
        System.out.println();
        System.out.println("Integer Queue Contents:");
        if (queue2.size()==0){
            System.out.println(queue2.peek()+" (Notice: Empty queue)");
        }
        else{
            while(!queue2.isEmpty()){
                System.out.println(queue2.dequeue());
            }
        }

    }
}
