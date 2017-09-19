package Manager;

public class  Assistant
{
	private String name;
	private double pay;
	public static int week;
	private static double taxRate;

	public Assistant(String n, double p) 
	{
		name = n;
		pay = p;
	}
	public void payRise (double r)
	{
		pay = pay*r;
	}
	public double getPay ()
	{
		return pay ;
	}
	
	public static void setRate(double t)
	{
		taxRate = t;
	}	
	public static void incrementRate()
	{
		taxRate = taxRate*1.1;
	}
	public double getTax ()
	{
		return pay*taxRate/100.0 ;
	}
}


