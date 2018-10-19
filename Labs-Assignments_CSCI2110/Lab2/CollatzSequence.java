import java.util.Scanner;
public class CollatzSequence {
    public static void main (String[]args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Please enter a num: ");
        long startNum=kb.nextLong();
        long [] max=new long [2];

        long startTime, endTime,executionTime;
        startTime=System.currentTimeMillis();

        max=nSequence(startNum);

        endTime=System.currentTimeMillis();
        executionTime=endTime-startTime;

        System.out.println("Starting Number with longest Collatz Sequence between 1 and N("+startNum+"): "+max[1]);
        System.out.println("Length of the longest sequence: "+max[0]);
        System.out.println("Execution Time(millisecs) is: "+executionTime);
    }

    public static long [] nSequence(long input)
    {
        long max []=new long [2];// the arrary store max values and return after the method is finished
        long tracker=1;//a tracker start from 1 and less than or equal to N
        long len=0;//length of the sequence
        max[0]=len;//store max length
        max[1]=0;//store max tracker(the nth number)
        while(tracker<=input)// all umbers from 1-N would be checked
        {
            len=sequence(tracker);//call method to get sequence
            if(max[0]<len)//only max length of sequence will be stored in array
            {
                max[0]=len;
                max[1]=tracker;
            }
            tracker++;
        }
        return max;
    }

    //method that count sequence
    public static long sequence(long n)
    {
        long count=0;//count is used to store sequence
        if(n<=1)
            return count;
        else{
            count=1;//for number>1
            while(n>1)//if n is even, divide it by 2;if n is odd ,let n *3 and +1
            {
                if(n%2!=0)
                    n=3*n+1;
                else
                    n=n/2;
                count++;//update count
            }
            return count;
        }
    }
}
