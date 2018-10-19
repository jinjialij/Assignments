public class Job {
    private String owner;
    private int jobId;

    public Job(){};

    public Job(String o, int j)
    {
        owner = o;
        jobId = j;
    }
    public String getOwner()
    {
        return owner;
    }
    public int getJobId()
    {
        return jobId;
    }

    public String toString(){
        return owner+"\t"+jobId;
    }
}
