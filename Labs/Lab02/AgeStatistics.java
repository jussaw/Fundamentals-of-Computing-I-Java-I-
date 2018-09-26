import java.util.Scanner;
/**
 *Asks for name age and gender. Gives age in minutes and centuries,
 *and gives you your maximum heart rate.
 *
 *@author Justin Sawyer
 *@version 01-24-16
 */
public class AgeStatistics
{
   /**
    *Asks and prints info stated above.
    *
    *@param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //Convert age from years to minutes:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      
      //Convert age from years to centuries: 
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      
      //Display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) //calculate female MHR
      {
         maxHeartRate = 209 - (0.7 * ageInYears);
      } else {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
   }
}