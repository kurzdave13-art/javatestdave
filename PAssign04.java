/**
* File: PAssign04.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Feb 27, 2026
* Last Modified: Feb 27, 2026
* Description: calculate if point is in rectangle.
*/
import java.util.Scanner;
public class PAssign04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt the user for width and height
        System.out.println("Enter width for rectangle:");
        int width = input.nextInt();
        System.out.println("Enter height for rectangle:");
        int height = input.nextInt();
        input.nextLine();
        // check if the inputs are negative
        if (width <= 0 || height <= 0) {
            System.out.println("Your rectangle must have a positive height and width.");
        }else {
            // prompt user for cordinates
            System.out.println("Enter x,y value for center point of rectangle:");
            String center = input.nextLine();
            System.out.println("Enter x,y value for test point:");
            String testPoint = input.nextLine();
            
            // find the index of the comma
            int commaIndexCenter = center.indexOf(",");
            // create substrings
            String centerX = center.substring(0, commaIndexCenter);
            String centerY = center.substring(commaIndexCenter + 1);

             // repeat last steps with other variable
            int commaIndexTest = testPoint.indexOf(",");
            String testX = testPoint.substring(0, commaIndexTest);
            String testY = testPoint.substring(commaIndexTest + 1);

             // covert strings to integers
            int numCenterX =  Integer.parseInt(centerX);
             int numCenterY =  Integer.parseInt(centerY);
             int numTestX =  Integer.parseInt(testX);
             int numTestY =  Integer.parseInt(testY);

             // calculate horizontal and vertical distance
             int horDist = (int) Math.sqrt((numTestX - numCenterX) * (numTestX - numCenterX));
             int vertDist = (int) Math.sqrt((numTestY - numCenterY) * (numTestY - numCenterY));
             // check if the point is in the rectangle or not
             if (horDist <= (width) / 2 && vertDist <= (height) / 2) {
                // print out results
                System.out.printf("(%d, %d) is in the rectangle centered at (%d, %d) with width %d and height %d", numTestX, numTestY, numCenterX, numCenterY, width, height);
              }else{
                System.out.printf("(%d, %d) is not in the rectangle centered at (%d, %d) with width %d and height %d", numTestX, numTestY, numCenterX, numCenterY, width, height);
              }
        }
    }
}
