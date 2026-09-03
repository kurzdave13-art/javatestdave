import java.util.Scanner;
public class A1p1 {
    public static int countDigits(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        
        String[] stringList = new String[n];

        for(int i = 0; i < stringList.length; i++){
            stringList[i] = input.nextLine();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] stringDigits = new int[n];
        for(int i = 0; i < stringList.length; i++){
            stringDigits[i] = countDigits(stringList[i]);
            if(stringDigits[i] < min){
                min = stringDigits[i];
            }
            if(stringDigits[i] > max){
                max = stringDigits[i];
            }
        }
        System.out.println("The strings with the largest number of decimal digits are:");
        for(int i = 0; i < stringList.length; i++){
            if(stringDigits[i] == max){
                System.out.println(stringList[i]);
            }
        }
        System.out.println("The strings with the smallest number of decimal digits are:");
        for(int i = 0; i < stringList.length; i++){
            if(stringDigits[i] == min){
                System.out.println(stringList[i]);
            }
        }
    }
}
