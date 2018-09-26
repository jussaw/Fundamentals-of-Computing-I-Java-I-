import java.util.Scanner;

/**
 *Converts message inputed by user.
 *
 *@author Justin Sawyer
 *@version 1-30-16
 */
public class MessageConverter
{
   /**
    *Asks user to Input message then gives them four option of how to
    *convert that message, then displayed the converted message.
    *
    *@param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      //Declare variables: userInput, message, result, outputType.
      Scanner userInput = new Scanner(System.in);
      String message, result;
      int outputType;
      
      //Asks user to input message.
      System.out.print("Type in a message and press enter: \n\t> ");
      message = userInput.nextLine();
      
      //Asks user how to convert message.
      System.out.print("\nOutput types:"
         + "\n\t1: As is"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      
      //Checks which option user inputed and follows through with it.
      if (outputType == 1)
      {
         result = message;
      }
      else if (outputType == 2) 
      {
         result = message.toLowerCase();
      }
      else if (outputType == 3) 
      {
         result = message.toUpperCase();
      }
      else if (outputType == 4) 
      {
         result = message.replace('a','_');
         result = result.replace('e','_');
         result = result.replace('i','_');
         result = result.replace('o','_');
         result = result.replace('u','_');
         result = result.replace('A','_');
         result = result.replace('E','_');
         result = result.replace('I','_');
         result = result.replace('O','_');
         result = result.replace('U','_');
      }
      else 
      {
         
         result = "Error: Invalid choice input.";
      }
      
      //Displays converted message, or error.
      System.out.println("\n" + result);
   }
}