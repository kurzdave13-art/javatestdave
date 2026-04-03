package Lab9;
// import gsu.Math;
public class Lab09Prob01 {
    public static void main(String[] args) {
        // declares an array that 12 numbers long
        int nums[] = new int[12];

        // creates randoms numbers to go into the array
        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int)(-256 + Math.random() * (256 - (-256) + 1));
        }
        // prints length
        System.out.println("Length: " + nums.length);
        System.out.println();
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        // calls the minimum and index and prints results
        int[] minAndIndex = getMinAndIndex(nums);
        System.out.println("Minimum value: " + minAndIndex[0] + " at index " + minAndIndex[1]);
    }
    // finds the minimum and index where the minimun is located in the array
    public static int[] getMinAndIndex(int[] nums) {
        int min = nums[0];
        int index = 0;
        int[] minAndIndex = new int[2];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }
        minAndIndex[0] = min;
        minAndIndex[1] = index;
        return minAndIndex;
    }
}
