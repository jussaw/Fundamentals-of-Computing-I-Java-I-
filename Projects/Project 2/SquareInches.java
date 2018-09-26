import java.util.Scanner;
/**
 *Asks for square inches and converts to other units.
 *
 *@author Justin Sawyer
 *@version 01-25-16
 */
public class SquareInches
{
   /**
    *Asks for square inches then converts to acres, square yards, square feet.
    *
    *@param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      //Declare Variables
      Scanner userInput = new Scanner(System.in);
      int sqInches, sqInches2, sqInches3, sqInches4, acres, sqYards, sqFeet;
      
      //Prompts user to input the square inches
      System.out.print("Enter the area in square inches: ");
      sqInches = userInput.nextInt();
      
      if (sqInches > 1000000000)
      {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
      else 
      {
         /*Converts square inches to acres, aqueare yards, and square feet,
           and square inches to their most maximum value.
          */
         acres = sqInches / 6272640;
         sqInches2 = sqInches - (6272640 * acres);
         sqYards = sqInches2 / 1296;
         sqInches3 = sqInches2 - (1296 * sqYards);
         sqFeet = sqInches3 / 144;
         sqInches4 = sqInches3 - (144 * sqFeet);
         
         //Prints the maximum values calcutalted.
         System.out.println("Number of Units:"
            + "\n\tAcres: " + acres
            + "\n\tSquare Yards: " + sqYards
            + "\n\tSquare Feet: " + sqFeet
            + "\n\tSquare Inches: " + sqInches4);
      }
   }
}