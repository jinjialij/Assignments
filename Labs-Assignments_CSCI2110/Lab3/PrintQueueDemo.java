import java.util.Scanner;
public class PrintQueueDemo {
    public static void main(String[]args){
        PrintQueue pq=new PrintQueue();
        Scanner kb=new Scanner(System.in);
        //this part test lpr
        System.out.print("Please input job information:\nPlease input owner (enter q to end): ");
        String own=kb.next();
        while(!own.equalsIgnoreCase("q")){
            System.out.print("Please input Job ID : ");
            int id=kb.nextInt();
            pq.lpr(own,id);//add new Job item in the queue list
            System.out.print("Please input owner (enter q to end): ");
            own=kb.next();
        }

        System.out.println("\nDisplay all content: ");
        pq.lpq();
        System.out.println();

        //test lprm method
        System.out.print("Please input a Job id and it will be deleted if it is in the first entry (enter -1 to quit): ");
        int input=kb.nextInt();
        while (input != -1) {
            pq.lprm(input);
            System.out.println("\nDisplay all content: ");
            pq.lpq();
            System.out.print("Please input a Job id and it will be deleted if it is in the first entry (enter -1 to quit): ");
            input=kb.nextInt();
        }

        //test lprmAll
        System.out.print("Please enter an job owner's name, it would be deleted entirely form the list(enter q to end): ");
        String name=kb.next();
        while(!name.equalsIgnoreCase("q")){
            pq.lprmAll(name);
            System.out.println("\nDisplay all content: ");
            pq.lpq();
            System.out.print("Please enter an job owner's name, it would be deleted entirely form the list(enter q to end): ");
            name=kb.next();
        }
    }
}
