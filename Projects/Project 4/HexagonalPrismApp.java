import java.util.Scanner;
/**
 *Asks user to input a label, side and height. Then it creates an instance
 *of the HexagonalPrism class with the information given.
 *
 *Project #4
 *@author Justin Sawyer
 *@version 02-08-16
 */
public class HexagonalPrismApp
{
   /**
    *Prints to std output.
    *
    *@param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String label;
      double side, height;
     
      System.out.print("Enter label, side, and height for a hexagonal prism.");
      System.out.print("\n\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\tside: ");
      side = userInput.nextDouble();
      System.out.print("\theight: ");
      height = userInput.nextDouble();
      HexagonalPrism hP = new HexagonalPrism(label, side, height);
      System.out.print(hP.toString());
   }
}