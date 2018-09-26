import java.util.Scanner;
/**
 *Finds slope and intercepts when goven two points.
 *
 *@author Justin Sawyer
 *@version 01-25-16
 */
public class SlopeIntercept
{
   /**
    *Asks for two points and gives slope, x intercept, and y intercept
    *if applicable.
    *
    *@param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      //Declare Vaiables
      Scanner userInput = new Scanner(System.in);
      double x1, x2, y1, y2, slope, xint, yint;
      
      //Asks for for x and y points and saves them.
      System.out.print("Enter the starting x and y points:"
         + "\n\tx1 = ");
      x1 = userInput.nextDouble();
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();
      
      System.out.print("Enter the ending x and y points:"
         + "\n\tx2 = ");
      x2 = userInput.nextDouble();
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
      
      //Calculates and prints slope if applicable.
      if (x1 == x2)
      {
         System.out.println("Slope: \"undefined\"");
      }
      else
      {
         slope = (y2 - y1) / (x2 - x1);
         System.out.print("Slope: " + slope);
         //Calculates and prints y intercept if applicable.
         yint = y1 - slope * x1;
         System.out.print("\nY intercept: " + yint);
         
         //Calculates and prints x intercept if applicable.r
         if (slope == 0)
         {
            System.out.print("\nX intercept: \"undefined\"");
         }
         else
         {
            xint = -1 * (yint / slope);
            System.out.print("\nX intercept: " + xint);
         }
      }
   }
}