import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 *Driver program to run HexagonalPrismList.
 *
 *Project #5
 *@author Justin Sawyer
 *@version 02-28-16
 */
public class HexagonalPrismListApp
{
   /**
    *Prints to std output.
    *
    *@param args Command line arguments (not used).
    *@throws IOException from scanning input file.
    */
   public static void main(String[] args) throws IOException
   {
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      String listName = "";
      String name = "";
      double side = 0.0;
      double height = 0.0;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
   
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         name = scanFile.nextLine();
         side = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         HexagonalPrism hP = new HexagonalPrism(name, side, height);
         myList.add(hP);
      }
      
      HexagonalPrismList myHexagonalPrismList = 
         new HexagonalPrismList(listName, myList);
      
      System.out.println(myHexagonalPrismList);
      
      System.out.println(myHexagonalPrismList.summaryInfo());    

   }   
}