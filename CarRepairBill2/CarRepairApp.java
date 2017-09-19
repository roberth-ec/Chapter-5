package CarRepairBill2;

import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;
class CarRepairApp
{
    public static void main(String[] args) 
    {
        DecimalFormat pounds = new DecimalFormat("�#,###.00");
        String partsStr = read("What is the parts cost");
        String hoursStr = read("How many hours");
        double parts = Double.parseDouble(partsStr);
        double hours = Double.parseDouble(hoursStr);
        CarRepair myRepair = new CarRepair();
        myRepair.setParts(parts);
        myRepair.setHours(hours);
        double bill = myRepair.calculateBill();
        display("Your bill is " + pounds.format(bill));
    }

    private static void display(String s)
    {
        showMessageDialog(null, s);
    }

    private static String read(String prompt)
    {
        return showInputDialog(prompt);
    }
}