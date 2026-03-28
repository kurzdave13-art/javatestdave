
import java.util.Scanner;
public class PAssign07 {
    public static void main(String[] args) {
       // import necessary variables
        Scanner input = new Scanner(System.in);
        String message = "";
        char ch = ' ';
        // propmt user to enter a string and a char until they enter STOP
        while(!message.equals("STOP")) {
            System.out.println("Enter a message: ");
            message = input.nextLine();
            if (!message.equals("STOP")){
                System.out.println("Enter a character: ");
                ch = input.next().charAt(0);
                input.nextLine();
                // call necessary methods
                int count = countCharacters(message, ch);
                printCount(message, ch, count);
                System.out.println("The reverse of " + message + " is " + reverseString(message));
            }
        }
    }
    // create a method to count how many characters are in a string
    public static int countCharacters(String message, char ch) {
        int count = 0;
        for(int i = 0; i < message.length(); i++){
            if (ch == message.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    // create a method to print the number of times it shows up in the string, no return values
    public static void printCount(String message, char ch, int count) {
        System.out.println(ch + " occurs in " + message + " " + count + " times");
    }
    // create a method to reverse the string entered by the user
    public static String reverseString(String message) {
        String reverse = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reverse += message.charAt(i);
        }
        return reverse;
    }       
}
