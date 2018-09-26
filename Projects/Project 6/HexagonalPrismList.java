import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 *Stores information of a hexagonal prism list.
 *
 *Project #6
 *@author Justin Sawyer
 *@version 0-07-16
 */
public class HexagonalPrismList
{
   //Fields
   private String listName;
   private ArrayList<HexagonalPrism> hpList;
   
   /**
     *Initializes a HexagonalPrismList object given the list name and list.
     *     
     *@param listNameIn List name
     *@param hpListIn HexagonalPrism ArrayList
     */

   public HexagonalPrismList(String listNameIn,
      ArrayList<HexagonalPrism> hpListIn)
   {
      listName = listNameIn;
      hpList = hpListIn;
   }
   
   /**
     *@return The name of the list.
     */
   public String getName()
   {
      return listName;
   }
   
   /**  
     *@return The number of hexagon prisms.
     */
   public int numberOfHexagonalPrisms()
   {
      return hpList.size();
   }
   
   /**
     *Adds all the surface areas.
     *     
     *@return double The total of all the surface areas,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double totalSurfaceArea()
   {
      if (numberOfHexagonalPrisms() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
         int i = 0;
         while (i < hpList.size())
         {
            total += hpList.get(i).surfaceArea();
            i++;
         }
         return total;
      }
   }
   
   /**
     *Adds all the volumes.
     *     
     *@return double The total of all the volumes,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double totalVolume()
   {
      if (numberOfHexagonalPrisms() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
         int i = 0;
         while (i < hpList.size())
         {
            total += hpList.get(i).volume();
            i++;
         }
         return total;
      }
   }
   
   /**
     *Adds all the base perimeters.
     *     
     *@return double The total of all the base perimeters,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double totalBasePerimeter()
   {
      if (numberOfHexagonalPrisms() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
         int i = 0;
         while (i < hpList.size())
         {
            total += hpList.get(i).basePerimeter();
            i++;
         }
         return total;
      }
   }
   
   /**
     *Adds all the base areas.
     *     
     *@return double The total of all the volumes,
     *or returns 0 if there are no base areas.
     */
   public double totalBaseArea()
   {
      if (numberOfHexagonalPrisms() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
         int i = 0;
         while (i < hpList.size())
         {
            total += hpList.get(i).baseArea();
            i++;
         }
         return total;
      }
   }
   
   /**
     *Adds all the surfaces areas then divides by the amount of hexagonal
     *prisms.
     *     
     *@return double The average of all the surface areas,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double averageSurfaceArea()
   {
      if (numberOfHexagonalPrisms() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
         int i = 0;
         while (i < hpList.size())
         {
            total += hpList.get(i).surfaceArea();
            i++;
         }
         double average = total / hpList.size();
         return average;
      }
   }
   
   /**
     *Adds all the volumes then divides by the amount of hexagonal prisms.
     *     
     *@return double The average of all the volumes,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double averageVolume()
   {
      if (numberOfHexagonalPrisms() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
         int i = 0;
         while (i < hpList.size())
         {
            total += hpList.get(i).volume();
            i++;
         }
         double average = total / hpList.size();
         return average;
      }
   }
   
   /**
     *@return String toString.
     */

   public String toString()
   {
      int i = 0;
      String result = "\n" + listName + "\n";
      while (i < hpList.size())
      {
         result += "\n" + hpList.get(i) + "\n";
         i++;
      }
      return result;
   }
   
   /**
     *@return String Summary info.
     */

   public String summaryInfo()
   {
      DecimalFormat standard = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- " + getName() + " Summary" + " -----"; 
      result += "\nNumber of Hexagonal Prisms: " + numberOfHexagonalPrisms();
      result += "\nTotal Surface Area: "
         + standard.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "  + standard.format(totalVolume());
      result += "\nTotal Base Perimeter: " 
         + standard.format(totalBasePerimeter());
      result += "\nTotal Base Area: "  + standard.format(totalBaseArea());
      result += "\nAverage Surface Area: " 
         + standard.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + standard.format(averageVolume());
      
      return result;
   }
   
   /**
     *@return ArrayList<HexagonalPrism>
     */
   public ArrayList<HexagonalPrism> getList()
   {
      return hpList;
   }
   
   /**
     *Reads in file for a hexagonal prism list and returns object for it.
     *
     *@param nameIn for name
     *@throws IOException from scanning input file.
     *@return HexagonalPrismList
     */
   public HexagonalPrismList readFile(String nameIn) throws IOException
   {
      Scanner scanFile = new Scanner(new File(nameIn));
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      String name = "";
      double side = 0;
      double height = 0;
      
      listName = scanFile.nextLine(); 
      while (scanFile.hasNext())
      {
         name = scanFile.nextLine();
         side = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         HexagonalPrism hP = new HexagonalPrism(name, side, height);
         myList.add(hP);
      }
      
      HexagonalPrismList hpL = new HexagonalPrismList(listName, myList);
      return hpL;
   }
   
   /**
     *Adds HexagonalPism object to list.
     *
     *@param label of new HexagonalPrism object
     *@param side of new HexagonalPrism object
     *@param height of new HexagonalPrism object
     */
   public void addHexagonalPrism(String label, double side, double height)
   {
      HexagonalPrism hP = new HexagonalPrism(label, side, height);
      hpList.add(hP);
   }
   
   /**
     *Deletes HexagonalPrism object form list.
     *
     *@param label of HexagonalPrism object
     *@return HexagonalPrism 
     */
   public HexagonalPrism deleteHexagonalPrism(String label)
   {
      HexagonalPrism hP;
      int i = 0;
      
      while (i < hpList.size())
      {
         if (hpList.get(i).getLabel().equalsIgnoreCase(label))
         {
            hP = hpList.get(i);
            hpList.remove(i);
            return hP;
         }
         i++;
      }
      
      return null;
   }
   
   /**
     *Finds HexagonalPrism object.
     *
     *@param label of HexagonalPrism object
     *@return HexagonalPrism
     */
   public HexagonalPrism findHexagonalPrism(String label)
   {
      HexagonalPrism hP;
      int i = 0;
      
      while (i < hpList.size())
      {
         if (hpList.get(i).getLabel().equalsIgnoreCase(label))
         {
            hP = hpList.get(i);
            return hP;
         }
         i++;
      }
      
      return null;
   }
   
   /**
     *Edits HexagonalPrism objct.
     *
     *@param label of HexagonalPrism object
     *@param side of HexagonalPrism object
     *@param height of HexagonalPrism object
     *@return boolean
     */
   public boolean editHexagonalPrism(String label, double side, double height)
   {
      boolean result = false;
      HexagonalPrism hP;
      int i = 0;
      
      while (i < hpList.size())
      {
         if (hpList.get(i).getLabel().equalsIgnoreCase(label))
         {
            hpList.get(i).setSide(side);
            hpList.get(i).setHeight(height);
            result = true;
         }
         i++;
      }
      
      return result;
   }
}

