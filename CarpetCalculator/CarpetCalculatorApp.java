package CarpetCalculator;

import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;
class CarpetCalculatorApp
{
    public static void main(String[] args)
    {
        DecimalFormat pounds = new DecimalFormat("£###,##0.00");
        DecimalFormat twoDP = new DecimalFormat("##0.00");
        String roomLengthStr =
            showInputDialog("What is the room length (m)?");
        String roomWidthStr =
            showInputDialog("What is the room width (m)?");
        double roomLength = Double.parseDouble(roomLengthStr);
        double roomWidth = Double.parseDouble(roomWidthStr);
        String carpetName;
        double squareMeters;
        double totalCost;

        CarpetCalculator luxury =
            new CarpetCalculator("Berber", 27.95, roomLength, roomWidth);

        CarpetCalculator economy =
            new CarpetCalculator("Pile", 15.95, roomLength, roomWidth);

        // luxury carpet
        carpetName = luxury.getCarpetName();
        squareMeters = luxury.getAreaSquareMeters();
        totalCost = luxury.determineTotalCost();
        showMessageDialog
            (null, "The cost of " + twoDP.format(squareMeters) +
                     " square meters of " + carpetName +
                     " is " + pounds.format(totalCost));

        // economy carpet - same square metres calculation
        carpetName = economy.getCarpetName();
        totalCost = economy.determineTotalCost();
        showMessageDialog
            (null, "The cost of " + twoDP.format(squareMeters) +
                     " square meters of " + carpetName +
                     " is " + pounds.format(totalCost));
    }
}