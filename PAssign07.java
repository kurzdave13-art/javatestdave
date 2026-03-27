import java.util.Scanner;
public class PAssign07 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        String message = "";
        char ch = ' ';
        while(!message.equals("STOP")) {
            System.out.println("Enter a message: ");
            message = input.nextLine();
            if (!message.equals("STOP")){
                System.out.println("Enter a character: ");
                ch = input.next().charAt(0);
                input.nextLine();
                int count = countCharacters(message, ch);
                printCount(message, ch, count);
                System.out.println("The reverse of " + message + " is " + reverseString(message));
            }
        }
    }
    public static int countCharacters(String message, char ch) {
        int count = 0;
        for(int i = 0; i < message.length(); i++){
            if (ch == message.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static void printCount(String message, char ch, int count) {
        System.out.println(ch + " occurs in " + message + " " + count + " times");
    }
    public static String reverseString(String message) {
        String reverse = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reverse += message.charAt(i);
        }
        return reverse;
    }       
}
