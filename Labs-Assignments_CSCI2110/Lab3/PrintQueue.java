import java.lang.*;
public class PrintQueue {
    private GenericQueue <Job> q;
    //constructor
    PrintQueue(){q=new GenericQueue <Job> ();}

    //Enqueues a job with the specified owner name and job id
    public void lpr(String owner, int jobId){
        q.enqueue(new Job(owner,jobId));
    }

    //Prints all the entries in this queue
    public void lpq(){
        if(q.first()==null){
            System.out.println("Empty queue.");
        }
        else{
            System.out.println(q.first());
            for(int i=1;i<q.size();i++){
                System.out.println(q.next());
            }
            }
    }

    //Removes the active job at the front of the queue if jobId matches, error message otherwise
    public void lprm(int jobId){
        if(q.first()==null){
            System.out.println("Empty queue. No Job. Please enter Job(s) in the queue.");
        }
        else{
            Job holdJob = q.first();
            if(holdJob.getJobId()==jobId){
                q.remove(holdJob);
                System.out.println(jobId+" is removed successfully!");
            }
            else
                System.out.println("JobId doesn't match!");
        }
    }

    //Removes all jobs from the queue that have been submitted by the owner
    public void lprmAll(String owner){
        if(q.first()!=null) {
            int count=0;
            Job holdOwner = q.first();
            while(holdOwner!=null) {
                if(holdOwner.getOwner().equalsIgnoreCase(owner)) {//when owner is same with the input name,remove it and replace holdOwner with q.first()
                    q.remove(holdOwner);
                    count++;
                    holdOwner = q.first();
                }
                else
                    holdOwner=q.next();//if not equal, let holdOwner equals to q.next()
            }
            if (count!=0)
                System.out.println("remove success");
            else
                System.out.println("remove fail");
        }
        else
            System.out.println("Empty queue, remove fail.");
    }

}
