import java.util.Scanner;
public class A1p2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);

        int[] numberList = new int[n];
        for(int i = 0; i < numberList.length; i++){
            numberList[i] = input.nextInt();
        }

        System.out.println("The original integers are:");
        for(int i = 0; i < numberList.length; i++){
           if(i < numberList.length - 1){
            System.out.print(numberList[i] + ",");
           }else {
            System.out.print(numberList[i]);
           }
        }
        System.out.println();
        reversePairs(numberList);
        System.out.println("The pairs reversed integers are:");
        for(int i = 0; i < numberList.length; i++){
            if(i < numberList.length - 1){
                System.out.print(numberList[i] + ",");
            }else{
                System.out.print(numberList[i]);
            }
        }
    }
    public static void reversePairs(int[] numberList){
        for(int i = 0; i < numberList.length - 1; i += 2){
            int temp = numberList[i];
            numberList[i] = numberList[i+1];
            numberList[i+1] = temp;
        }
    }
}
