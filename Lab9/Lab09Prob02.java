package Lab9;

public class Lab09Prob02 {
    public static void main(String[] args) {
        // declars an array
        double[] nums = {-12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 82.0442710394, 155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203};
        // print every number of the area at the index its at
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("Index %d of %d: %.5f\n", i, nums.length - 1, nums[i]);
        } 
        System.out.println();
       // calls a method to get the max and the index the max is at
        double[] maxAndIndex = getMaxAndIndex(nums);
        System.out.printf("Maximum Value: %.5f at index %.0f\n", maxAndIndex[0], maxAndIndex[1]);
    }
   // finds the max and index its located
    public static double[] getMaxAndIndex(double[] nums) {
        double max = nums[0];
        int index = 0;
        double[] getMaxAndIndex = new double[2];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        getMaxAndIndex[0] = max;
        getMaxAndIndex[1] = index;
        return getMaxAndIndex;
    }
}
