//Finding nth prime number
import java.lang.Math;
import java.util.Scanner;
public class Prime {
	public static void main(String[]args)
	{

		Scanner kb=new Scanner(System.in);
		System.out.print("Enter the number of n: ");
		long inputNum=kb.nextLong();
		long startTime, endTime,executionTime;
		startTime=System.currentTimeMillis();

		long prime=findNextPrime(inputNum);//call method to calculate the prime number

		endTime=System.currentTimeMillis();
		executionTime=endTime-startTime;
		if(prime!=0) {
			System.out.println("The nth prime number is: " + prime);
		}
		else
			System.out.println("The number is not a prime number");
		System.out.println("Execution Time(millisecs) is: "+executionTime);
	}

	/*the method to find the nth prime number*/
	public static long findNextPrime(long inputNum)
	{
	    if(inputNum==1){return 2;}//the 1st prime number is 2
	    else if(inputNum==2){return 3;}//the 2nd prime number is 3
        else if(inputNum>2)
	    {
	        long prime=3;//start from 2nd prime number
	        long t=2;//t is used to keep track of the ordinal of prime number
	        while(t<inputNum){
                prime+=2;//prime is always odd after 2
	            if(isPrime(prime))//call method to check if it is a prime umber
                    t++;//if prime is a prime number,t+1
	        }
            return prime;
	    }
	    else
	        return 0;//if inputNum<1
	}


    /*Except 2, all prime number is odd, and all odd numbers that are divisible must
    less than the square root of the prime number*/
	public static boolean isPrime(long prime){
        if (prime > 2 && prime%2 == 0 )//if prime is bigger than 2 and is an even number, it cannot be a prime number
            return false;
        for(int i = 3; i<=Math.sqrt(prime); i+=2){
            if(prime% i == 0){
                return false;
            }
        }
        return true;
    }

}

