package Lab9;

public class Lab09Prob03 {
    public static void main(String[] args) {
        // declares an array
        double[] nums = {-12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 82.0442710394, 155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203};

        // calls necessary methods and prints their results
        double max = getMax(nums);
        System.out.printf("Maximum value: %.3f\n", max);
        double min = getMin(nums);
        System.out.printf("Minimum value: %.3f\n", min);
        double average = getAverage(nums);
        System.out.printf("Average value: %.3f\n", average);
        int numsOverAvg = getNumsOverAvg(nums, average);
        System.out.println("Values above average: " + numsOverAvg);
        int numsUnderAvg = getNumsUnderAvg(nums, average);
        System.out.println("Values below average: " + numsUnderAvg);
    }
    // finds the max
    public static double getMax(double[] nums) {
        double max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    // finds the min
    public static double getMin(double[] nums) {
        double min = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    // finds the average
    public static double getAverage(double[] nums) {
        double sum = 0.0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double average = sum / nums.length;
        return average;
    }
    // finds numbers over the average in the array
    public static int getNumsOverAvg(double[] nums, double average) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > average) {
                count++;
            }
        }
        return count;
    }
    // finds numbers below the average in the array
    public static int getNumsUnderAvg(double[] nums, double average) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < average) {
                count++;
            }
        }
        return count;
    }
}
