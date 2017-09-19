package CarpetCalculator;

class CarpetCalculator
{
    // private instance variables
    private String carpetName;
    private double pricePerSquareMeter;
    private double areaSquareMeters;

    // constructor - roomLength and roomWidth given in meters
    CarpetCalculator(String name,
                          double price,
                          double roomLength,
                          double roomWidth)
    {
        carpetName = name;
        pricePerSquareMeter = price;
        areaSquareMeters = roomLength * roomWidth;
    }

    // get methods
    public String getCarpetName()
    {
        return carpetName;
    }

    public double getPricePerSquareMeter()
    {
        return pricePerSquareMeter;
    }

    public double getAreaSquareMeters()
    {
        return areaSquareMeters;
    }

    // method to calculate total cost
    public double determineTotalCost()
    {
        return pricePerSquareMeter * areaSquareMeters;
    }
}