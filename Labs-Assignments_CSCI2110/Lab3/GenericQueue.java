import java.util.ArrayList;
public class GenericQueue <T>{
    private ArrayList<T> queue;
    int cursor=0;////the cursor is mainly used for the first and the next methods
    //constructor
    public GenericQueue(){queue=new ArrayList<T>();}

    //add new item to the end of the queue
    public void enqueue(T item){
        queue.add(item);
    };

    //remove and return the item from the front of the queue
    public T dequeue(){
        if (queue.isEmpty()){
            System.out.print(" Empty queue ");
            return null;
        }
        else{
            T x=queue.get(0);//get the front
            queue.remove(0);//remove from the front
                return x;
        }
    }


    //return the number of elements in the queue
    public int size(){
            return queue.size();
    }

    //return true if the queue is empty, false otherwise
    public boolean isEmpty(){
        if(queue.isEmpty())
            return true;
        else
            return false;
    }

    //clear the queue
    public void clear(){
        queue.clear();
    }

    //return the entry from the front of the queue, null if the queue is empty
    public T peek(){
        if(queue.isEmpty()){
            return null;
        }
        else{
            return queue.get(0);
        }
    }

    //Return the position of the specified item and -1 if not found.
    public int positionOf(T item){
        int result=-1;
        if (queue.contains(item)){
            result=queue.indexOf(item);//change result value only if queue contains the specified item
            return result;
        }
        else
            return result;
    }

    //Remove the first occurrence (from front) of specified item
    public void remove(T item){
        if (queue.isEmpty()){
            System.out.println("Empty queue! Remove failed");
        }
        else{
            queue.remove(item);
        }
    }

    //Return the first item in the queue(front), null if queue is empty
    public T first(){
        if(queue.isEmpty()){
            return null;
        }
        else{
            cursor=0;
            return queue.get(0);
        }
    }

    //Return the next item in the queue relative to the previous call to first or next. Return
    //null if end of queue is reached
    public T next(){
        if (queue.get(0)==null){
            return null;
        }
        else{
            cursor++;
            if (cursor>=queue.size())
                return null;
            else
                return queue.get(cursor);
        }

    }


}
