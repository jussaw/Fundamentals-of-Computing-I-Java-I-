import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *User inputs ticket code, and is returned information about ticket.
 *
 *Project #3
 *@author Justin Sawyer
 *@version 02-01-16
 */
public class SuperBowlBoxLunch
{
   /**
    *Prints to std output.
    *
    *@param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      /*Declares variables userInput, code, name, childMP, childMP1, childMP2,
       *childMs, adultMP, adultMP1, adultMP2, adultMs, theme, themeNum,
       *luck, lucky, adultMPD, adultMsD, adultMT, childMsD, childMT,
       *mealsTotal, random, themeNumI, money, meals
       */
      Scanner userInput = new Scanner(System.in);
      String code, name, childMP, childMP1, childMP2, childMs, adultMP,
         adultMP1, adultMP2, adultMs, theme, themeNum, luck, lucky;
      double adultMPD, adultMsD, adultMT, childMPD, childMsD,
         childMT, mealsTotal, random;
      int themeNumI;
      DecimalFormat money = new DecimalFormat("$#0.00");
      DecimalFormat meals = new DecimalFormat("#0");
      
      //Prompts user to enter ticket code.
      System.out.print("Enter order code: ");
      code = userInput.nextLine();
      code = code.trim();
      
      //Checks to see if input is shorter than 13, and if so prints error.
      if (code.length() < 13)
      {
         System.out.print("\n*** Invalid Order Code ***" 
            + "\nOrder code must have at least 13 characters.");
      }
      else
      {
         //Seperates the numbers in the code to their respective info.
         themeNum = code.substring(0, 1);
         adultMs = code.substring(1, 3);
         adultMP1 = code.substring(3, 5);
         adultMP2 = code.substring(5, 7);
         childMs = code.substring(7, 9);
         childMP1 = code.substring(9, 11);
         childMP2 = code.substring(11, 13);
         name = code.substring(13);
         
         //Puts period in the prices.
         adultMP = adultMP1 + "." + adultMP2;
         childMP = childMP1 + "." + childMP2;
         
         //Changes number of meals from string to double.
         adultMsD = Double.parseDouble(adultMs);
         childMsD = Double.parseDouble(childMs);
         
         //Calculates total price for meals.
         adultMPD = Double.parseDouble(adultMP);
         childMPD = Double.parseDouble(childMP);
         adultMT = adultMsD * adultMPD;
         childMT = childMsD * childMPD;
         mealsTotal = adultMT + childMT;
         
         //Changes theme number from string to int.
         themeNumI = Integer.parseInt(themeNum);
         
         //Checks to see what type of theme the ticket is.
         if (themeNumI == 0)
         {
            theme = "Broncos";
         }
         else if (themeNumI == 1)
         {
            theme = "Panthers";
         }
         else
         {
            theme = "Broncos and Panthers";
         }
         
         //Creates lucky number.
         random = Math.random();
         luck = new Double(random).toString();
         lucky = luck.substring(3, 7);
         
         /*Prints name, adult meals, child meals, total price,
          *theme, and lucky number.
          */
         System.out.print("\nName: " + name
            + "\nAdult meals: " + meals.format(adultMsD)
            + " at " + money.format(adultMPD)
            + "\nChild meals: " + meals.format(childMsD)
            + " at " + money.format(childMPD)
            + "\nTotal: " + money.format(mealsTotal)
            + "\nTheme: " + theme
            + "\nLucky Number: " + lucky);
      }
   }
}