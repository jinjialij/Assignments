import java.util.ArrayList;

public class Taxi extends TaxiInfo {
	//attributes
	private ArrayList<Receipt> receipts;
	private static double fuelEconomy; //L/100km
	private double totalPrice;
	private double totalDistTraveled;
	
	//constructor
	public Taxi(String i, String b, String c) {
		super(i,b,c);	
		receipts = new ArrayList<Receipt>();//it should be an empty list because when a taxi is add in the tracker list, it will not have any data
		//fuelEconomyOfTaxi(); // calculate fuel economy
	}
	
	//getters
	public ArrayList<Receipt> getReceipts() {return receipts;}
	public double getFuelEconomy() {return fuelEconomy;}
	public double getTotalPrice() {return totalPrice;}
	public double getTotalDistTraveled() {return totalDistTraveled;}
	public String getTaxiID(){return super.getId();}
	
	//setters
	public void setReceipts(ArrayList<Receipt> receipts) {this.receipts = receipts;}
	public void setTotalPrice(double totalPrice) {this.totalPrice = totalPrice;}
	public void setDistTraveled(double distTraveled) {this.totalDistTraveled = distTraveled;}
	
	//assumed there is no empty array list since the user puts taxi info and receipt info at the same
	public void fuelEconomyOfTaxi () {
		fuelEconomy = receipts.get(0).getAmount() / receipts.get(0).getDistance();
	}

	//add receipt into list
	public void addReceipt(Receipt r)
	{
		r.setRNum(""+getId() + ""+r.getRNum() + ""+receipts.size());
		receipts.add(r);
	}

	public void freshTotalDistTraveledAndPrice( ArrayList<Receipt> r)//it was in the constructor,I move it into a independent method
	{
		for(int j =0; j<r.size();j++) {
			totalDistTraveled += r.get(j).getDistance(); //adding up distance traveled
			totalPrice += r.get(j).getPrice(); //add up amount spent on gas
		}
	}

	public boolean containRum(String rnum2)
	{
		boolean res=false;
		for (int i=0;i<receipts.size();i++)
		{
			if (receipts.get(i).getRNum().equalsIgnoreCase(rnum2))
			{
				res=true;
			}
		}
		return res;
	}

	public boolean containDate(int y, int m, int d)
	{
		boolean result=false;
		for(int i=0;i<receipts.size();i++)
		{
			if(receipts.get(i).getDate()==d && receipts.get(i).getMonth()==m &&  receipts.get(i).getYear()==y)
			{
				result=true;
			}
		}
		return result;
	}

	public void printContainDate(int y, int m, int d)
	{
		for(int i=0;i<receipts.size();i++)
		{
			if(receipts.get(i).getDate()==d && receipts.get(i).getMonth()==m &&  receipts.get(i).getYear()==y)
			{
				System.out.print(receipts.get(i));
			}
		}
	}



	public void removeByRNum(String rnum1)
	{
		for (int i=0;i<receipts.size();i++)
		{
			if (receipts.get(i).getRNum().equalsIgnoreCase(rnum1))
			{
				receipts.remove(i);
			}
		}
	}

	/*//toString 
	public String toString() {
		 return receipts + "-->"; } */
}
