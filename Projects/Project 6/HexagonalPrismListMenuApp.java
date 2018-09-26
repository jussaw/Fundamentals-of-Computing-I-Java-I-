import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
/**
 *Driver for HexagonalPrism and HexagonalPrismList in list menu.
 *
 *Project #6
 *@author Justin Sawyer
 *@version 0-07-16
 */
public class HexagonalPrismListMenuApp
{
   /**
    *Prints to std output.
    *
    *@param args Command line arguments (not used).
    *@throws IOException from scanning input file.
    */
   public static void main(String[] args) throws IOException
   {
      String hpListName = "no list name";
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      HexagonalPrismList myHpList = new HexagonalPrismList(hpListName, myList);
      String fileName = "no file name";
      
      String label = "";
      double side = 0.0, height = 0.0;
      
      String code = "";
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Hexagonal Prism List System Menu\n"
                       + "R - Read File and Create Hexagonal Prism List\n"
                       + "P - Print Hexagonal Prism List\n" 
                       + "S - Print Summary\n"
                       + "A - Add Hexagonal Prism\n"   
                       + "D - Delete Hexagonal Prism\n"   
                       + "F - Find Hexagonal Prism\n"
                       + "E - Edit Hexagonal Prism\n"
                       + "Q - Quit");
      do 
      {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) 
         {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) 
         {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
            
               myHpList = myHpList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "Hexagonal Prism List created\n");
               break; 
                    
            case 'P':
               System.out.println(myHpList);
               break;
               
            case 'S':
               System.out.println("\n" + myHpList.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tSide: ");
               side = scan.nextDouble();
               System.out.print("\tHeight: ");
               height = scan.nextDouble();
               System.out.println("\t*** Hexagonal Prism added ***\n");
               myHpList.addHexagonalPrism(label, side, height);
               break;
         
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (myHpList.deleteHexagonalPrism(label) == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
               }
               else
               {
                  myHpList.deleteHexagonalPrism(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
                  break;
               }
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (myHpList.findHexagonalPrism(label) == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
               }
               else
               {
                  System.out.println(myHpList.findHexagonalPrism(label)
                     .toString()
                        + "\" deleted\n");
                  break;
               }
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tSide: ");
               side = scan.nextDouble();
               System.out.print("\tHeight: ");
               height = scan.nextDouble();
               if (myHpList.findHexagonalPrism(label) == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
               }
               else
               {
                  myHpList.editHexagonalPrism(label, side, height);
                  System.out.println("\t\""
                     + label + "\" successfully edited\n");
               }
               break;
                  
            case 'Q': case 'q':
               break;
               
            default:
             // loop again
         }
      
      } while (!code.equalsIgnoreCase("Q"));   
   }
}