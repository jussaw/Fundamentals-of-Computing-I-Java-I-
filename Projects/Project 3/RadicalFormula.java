import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *User inputs a number, which is then plugged in to a function.
 *Answer ans well as number of digits and formatted asnwer returned.
 *
 *Project #3
 *@author Justin Sawyer
 *@version 02-01-16
 */
public class RadicalFormula
{
   /**
    *Prints to std output.
    *
    *@param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      /*Declares variables x, a, b, answer, left, right, ansString,
       *userInput, ansFor. 
       */
      double x, a, b, answer;
      int left, right;
      String ansString;
      Scanner userInput = new Scanner(System.in);
      DecimalFormat ansFor = new DecimalFormat("#,###,##0.0##");
      
      //Asks user for number.
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //Calculates the function with user input and prints answer.
      a = Math.pow((3 * Math.pow(x, 8.0)) - (2 * Math.pow(x, 3.0)), 2);
      b = Math.abs((3 * Math.pow(x, 5.0)) - (2 * Math.pow(x, 3.0)));
      answer = Math.sqrt(a + b);
      System.out.print("Result: " + answer);
      
      //Finds number of digits there are on the left and right of decimal.
      ansString = Double.toString(answer);
      left = ansString.indexOf(".");
      right = ansString.length() - left - 1;
      
      //Formats and prints formatted answer.
      System.out.print("\n# digits to left of decimal point: " + left
         + "\n# digits to right of decimal point: " + right);
      System.out.print("\nFormatted Result: " + ansFor.format(answer));
   }
}