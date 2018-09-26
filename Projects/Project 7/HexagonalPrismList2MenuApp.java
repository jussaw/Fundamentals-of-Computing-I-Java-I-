import java.util.Scanner;
import java.io.IOException;
/**
  *Driver for HexagonalPrism and HexagonalPrismList in list menu.
  *
  *Project #8
  *@author Justin Sawyer
  *@version 03-21-16
  */
public class HexagonalPrismList2MenuApp
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
      HexagonalPrism [] myList = new HexagonalPrism[100];
      int numberElements = 0;
      HexagonalPrismList2 myHpList =
         new HexagonalPrismList2(hpListName, myList, numberElements);
      String fileName = "no file name";
      
      String label = "";
      double side = 0, height = 0;
      
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
               if (myHpList.editHexagonalPrism(label, side, height))
               {
                  myHpList.editHexagonalPrism(label, side, height);
                  System.out.println("\t\""
                     + label + "\" successfully edited\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
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