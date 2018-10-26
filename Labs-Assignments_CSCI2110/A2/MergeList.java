import java.io.*;
import java.util.Scanner;
public class MergeList{
    public static void main(String[] args) throws IOException
    {
        //read from file and insert names into orderlist1 name1
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = kb.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        OrderedList <String> names1 = new OrderedList<String>();
        String name;
        while(inputFile.hasNext())
        {
            name=inputFile.nextLine();
            names1.insert(name);
        }
        inputFile.close();
        names1.enumerate();

        //read from file and insert names into orderlist2 name2
        System.out.print("Enter the filename to read from: ");
        filename = kb.nextLine();
        file = new File(filename);
        inputFile = new Scanner(file);
        OrderedList <String> names2 = new OrderedList<String>();

        while(inputFile.hasNext())
        {
            name=inputFile.nextLine();
            names2.insert(name);
        }
        inputFile.close();
        names2.enumerate();

        //use merge method to merge names1 and names2 to an orderlist3 names3
        OrderedList <String> names3;
        names3=merge(names1,names2);
        names3.enumerate();
    }

    //a method that merage two orderlists to a new orderlist by using the two-finger walking algorithm
    public static <T extends Comparable<T>> OrderedList<T> merge (OrderedList<T> list1,OrderedList<T> list2)
    {
        OrderedList <T> list3 = new OrderedList<T>();
        int f1=0,f2=0;
        while(f1<list1.size() &&f2<list2.size())//if f1 and f2 is in the list1 and list2
        {
            if (list1.get(f1).compareTo(list2.get(f2))<0)//if item at postion f1 in list1 is smaller than  item at postion f2 in list2
            {
                list3.add(list1.get(f1));//add item at postion f1 in list1 to list3
                f1++;//inrease f1 by 1
            }
            else if (list1.get(f1).compareTo(list2.get(f2))>0)//if item at postion f1 in list1 is greater than  item at postion f2 in list2
            {
                list3.add(list2.get(f2));//add item at postion f2 in list2 to list3
                f2++;//increase f2 by 1
            }
            else//if item at postion f1 in list1 equals to the item at postion f2 in list2
            {
                list3.add(list1.get(f1));//add either one
                f1++;//increase f1 & f2 by 1
                f2++;
            }
        }
        if (f1== list1.size())//if list 1 is over
        {
            while(f2<list2.size())//if f2 is not at the end of the list 2
            {
                list3.add(list2.get(f2));//add the rest of list2 to list3
                f2++;
            }
        }
        if (f2 == list2.size())//if list 2 is over
        {
            while(f1 < list1.size())//if f1 is not at the end of the list 1
            {
                list3.add(list1.get(f1));//add the rest of list1 to list3
                f1++;
            }
        }
        return list3;
    }
}
