import java.util.*;
public class testDemo_receipt {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        Receipt rc11 = new Receipt(2010,01, 02,  1.2, 20, 200);
        Receipt rc12 = new Receipt(2010,01, 03,  1.5, 60, 550);
        Receipt rc13 = new Receipt(2010,02, 02,  1.1, 70, 700);
        Receipt rc14 = new Receipt(2010,02, 04,  1.7, 90, 900);
        Receipt rc15 = new Receipt(2010,03, 03, 1.4, 40, 300);
        Receipt rc16 = new Receipt(2010,03, 12,  1.6, 30, 250);
        Receipt rc17 = new Receipt(2010,01, 02,  1.9, 35, 330);
        Receipt rc18 = new Receipt(2010,01, 02,  1.8, 45, 410);
        Receipt rc21 = new Receipt(2010,1, 5, 1.2, 20, 100);
        Receipt rc22 = new Receipt(2010,1, 7, 1.9, 60, 450);
        Receipt rc23 = new Receipt(2010,2, 8,  1.8, 70, 600);
        Receipt rc24 = new Receipt(2010,2, 9,  1.8, 90, 800);
        Receipt rc25 = new Receipt(2010,3, 20, 1.6, 40, 200);
        Receipt rc26 = new Receipt(2010,3, 21, 1.7, 30, 150);

        Taxi taxi1 = new Taxi("A", "Toyota", "black");
        taxi1.addReceipt(rc11);
        taxi1.addReceipt(rc12);
        taxi1.addReceipt(rc13);
        taxi1.addReceipt(rc14);
        taxi1.addReceipt(rc15);
        taxi1.addReceipt(rc16);
        taxi1.addReceipt(rc17);
        taxi1.addReceipt(rc18);
        Taxi taxi2 = new Taxi("B", "Chrysler", "white");
        taxi2.addReceipt(rc21);
        taxi2.addReceipt(rc22);
        taxi2.addReceipt(rc23);
        taxi2.addReceipt(rc24);
        taxi2.addReceipt(rc25);
        taxi2.addReceipt(rc26);

        LinkedList<Taxi> taxilist = new LinkedList<Taxi>();//this should be in tracker
        taxilist.addFirst(taxi1);//should call method in tracker and add
        taxilist.addFirst(taxi2);
        //end of data input

        int option = 0;
        int y,d,m;
        double p,a,dis;
        String tID,rnum1;
        System.out.println("Please choose Add receipt(1)\tSearch receipt(2)\t-1 to exit: ");
        option=kb.nextInt();
        while(option!=-1) {
            //add option
            if(option==1) {
                System.out.println("Receipt:\nTaxi ID: ");
                tID = kb.next();
                System.out.println("Date:\nYear： ");
                y = kb.nextInt();
                System.out.println("Month： ");
                m = kb.nextInt();
                System.out.println("Day： ");
                d = kb.nextInt();
                System.out.println("Gas price： ");
                p = kb.nextDouble();
                System.out.println("Gas amount： ");
                a = kb.nextDouble();
                System.out.println("distance： ");
                dis=kb.nextDouble();
                int count=0;
                for (int i = 0; i < taxilist.size(); i++) {
                    if (taxilist.get(i).getTaxiID().equalsIgnoreCase(tID)) {//this condition can be a method named containTaxiID
                        taxilist.get(i).addReceipt(new Receipt(y, m, d, p, a, dis));
                        count++;
                        ;//create a receipt and add this receipt into taxi's arraylist
                    }
                }
                if(count==0)
                {
                    System.out.println("No such Taxi ID, failed to add the receipt.");
                }
                else
                {
                    System.out.println("Add successfully.");
                    count=0;
                }
            }
            else if(option==2)//search option
            {
                System.out.println("Search Receipt: ");
                System.out.println("Please input Taxi ID: ");
                tID=kb.next();
                System.out.println("Date:\nYear： ");
                y = kb.nextInt();
                System.out.println("Month： ");
                m = kb.nextInt();
                System.out.println("Day： ");
                d = kb.nextInt();
                boolean conatinIDAndDate=false;
                int countRnum=0;
                for (int i=0;i<taxilist.size();i++)
                {
                    if (taxilist.get(i).getTaxiID().equalsIgnoreCase(tID) && taxilist.get(i).containDate(y,m,d)==true)//method containTaxiID
                    {
                        conatinIDAndDate=true;
                        taxilist.get(i).printContainDate(y,m,d);
                    }
                }
                if (conatinIDAndDate)
                {
                    System.out.println("Please input the Receipt number if you want to delete it or enter -1 to quite: ");
                    rnum1=kb.next();
                    if(!rnum1.equals("-1"))
                    {
                        for (int i=0;i<taxilist.size();i++)
                        {
                            for (int j=0;j<taxilist.get(i).getReceipts().size();j++)
                            {
                                if (taxilist.get(i).getReceipts().get(j).getRNum().equalsIgnoreCase(rnum1))
                                {
                                    taxilist.get(i).getReceipts().remove(j);
                                    countRnum++;
                                }
                            }


                        }
                        if(countRnum!=0){
                            System.out.println("Delete successfully.");
                            countRnum=0;
                        }
                        else
                        {
                            System.out.println("Invaild receipt number, unable to delete.");
                        }

                    }

                }
                else
                {
                    System.out.println("No result. Please check if your Taxi ID or date is wrong.");
                }

            }
            System.out.println();
            System.out.println("Please choose Add receipt(1)\tSearch receipt(2)\t-1 to exit: ");
            option=kb.nextInt();


        }
    }


}
