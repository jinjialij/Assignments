import java.util.ArrayList;
public class Exercise1 {
    public static void main(String[]args){
        /*GenericQueue <Integer> queue=new <Integer> GenericQueue();
        if(queue.peek().equals(null)){
            System.out.print("Empty queue.");
        }
        else{
            System.out.print(queue.peek());
        }*/
        GenericQueue <Job> queue=new <Job> GenericQueue();
        Job j1=new Job("own1",456);
        Job j2=new Job("own2",456);
        Job j3=new Job("own3",456);
        Job j4=new Job("own4",456);
        Job j5=new Job("own5",456);
        Job j6=new Job("own6",456);

        queue.enqueue(j1);
        queue.enqueue(j2);
        queue.enqueue(j3);
        queue.enqueue(j4);
        queue.enqueue(j5);
        queue.enqueue(j6);
        System.out.println(queue.positionOf(j1));
        /*
        System.out.println(queue.first());
        System.out.println(queue.next());
        System.out.println(queue.next());
        System.out.println(queue.next());
        System.out.println(queue.next());
        System.out.println(queue.next());
        System.out.println(queue.next());*/


    }
}
