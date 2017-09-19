import static javax.swing.JOptionPane.*;
class TankApp 
{
    public static void main(String[] args) 
    {
        // input variables - dimensions of tank
        // Strings for input, to be converted to ints

        String lengthStr, widthStr, depthStr;
        lengthStr = showInputDialog("Length of tank (mm)");
        widthStr = showInputDialog("Width of tank (mm)");
        depthStr = showInputDialog("Depth of tank (mm)");

        long length, width, depth;
        length = Long.parseLong(lengthStr);
        width = Long.parseLong(widthStr);
        depth = Long.parseLong(depthStr);

        // calculate volume in cubic mm
        long volCmm = length * width * depth;

        // convert to volume in litres
        double volLitre = volCmm / 1000000.0;

        // round to the nearest litre
        long volume = Math.round(volLitre);

        // display volume of tank
        showMessageDialog(null, "Volume of fish tank is " + 
                                     volume + " litres");
    }
}
