public class PAssign01c {
    public static void main(String[] args) {
        final double R_VALUE = 8.31446;
        double volume =  0.25;
        int temperature = 313;
        int numMoles = 1;
        double pressure = (numMoles * R_VALUE * temperature) / volume;
        System.out.print("The pressure of " + numMoles + " mole(s) of an ideal gas with volume " + volume + " m^3 at temperature " + temperature + " K is " + pressure + " pascals.");
    }
}
