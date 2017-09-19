package CarRepairBill2;

class CarRepair
// no constructor so default is assumed
{
    private double parts;
    private double hours;
    private static final double HOURS_COST = 20;
    private static final double VAT = 17.5;

    public void setParts(double p)
    {
        parts = p;
    }

    public void setHours(double h)
    {
        hours = h;
    }

    public double calculateBill()
    {
        double bill = parts + hours * HOURS_COST;
        return bill * (1 + VAT / 100);
    }

}