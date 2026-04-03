import java.util.Scanner;
public class PAssign08 {
    public static void main(String[] args) {
        // declare a scanner variable
        Scanner input = new Scanner(System.in);
        // prompt user to enter numbers
        System.out.println("Enter number of values: ");
        int numVal = input.nextInt();
        int[] values = new int[numVal];
        // use the entered numbers and have them enter values 
        for(int i = 0; i < numVal; i++) {
            System.out.println("Enter value (" + (i + 1) + " of " + numVal + "): ");
            values[i] = input.nextInt();   
        }
        System.out.println();
        // calls necessary methods and print results
        printValues(values);
        int[] maxAndIndex = getMax(values);
        System.out.println("Maximum: " + maxAndIndex[0] + " at index " + maxAndIndex[1]);
        int[] minAndIndex = getMin(values);
        System.out.println("Minimum: " + minAndIndex[0] + " at index " + minAndIndex[1]);
        double average = getAverage(values);
        System.out.printf("Average: %.4f\n", average);
        int numUnderAvg = getNumberUnderAvg(values, average);
        int numOverAvg = getNumberOverAvg(values, average);
        System.out.println("Values over average: " + numOverAvg);
        System.out.println("Values under average: " + numUnderAvg);
    }
    // prints values of an array and the index
    public static void printValues(int[] values) {
        for(int i = 0; i < values.length; i++) {
            System.out.println("Index " + i + ": " + values[i]);
        }
        System.out.println();
    }
    // finds the max in an array
    public static int[] getMax(int[] values) {
        int max = values[0];
        int index = 0;
        int[] maxAndIndex = new int[2];
        for(int i = 1; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
                index = i;
            }
        }
        maxAndIndex[0] = max;
        maxAndIndex[1] = index;
        return maxAndIndex;
    }
    // finds the min in an array
    public static int[] getMin(int[] values){
        int min = values[0];
        int index = 0;
        int[] minAndIndex = new int[2];
        for(int i = 1; i < values.length; i++) {
            if(values[i] < min){
                min = values[i];
                index = i;
            }
        }
        minAndIndex[0] = min;
        minAndIndex[1] = index;
        return minAndIndex;
    }
    // finds the average of the array values
    public static double getAverage(int[] values) {
        double sum = 0.0;
        double average = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        average = sum / values.length;
        return average;
    }
    // finds numbers under the average in array
    public static int getNumberUnderAvg(int[] values, double average) {
        int count = 0;
        for(int i = 0; i < values.length; i++){
            if(values[i] < average){
            count++;
            }
        }
        return count;
    }
    // finds numbers over the average in array
    public static int getNumberOverAvg(int[] values, double average){
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if(values[i] > average){
            count++;
            }
        }
        return count;
    }
}
