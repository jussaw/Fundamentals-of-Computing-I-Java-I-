import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 *Stores information of a hexagonal prism list.
 *
 *Project #5
 *@author Justin Sawyer
 *@version 02-28-16
 */
public class HexagonalPrismList
{
   //Fields
   private String listName;
   private ArrayList<HexagonalPrism> hPList;
   
   /**
     *Initializes a HexagonalPrismList object given the list name and list.
     *     
     *@param listNameIn List name
     *@param hPListIn HexagonalPrism ArrayList
     */

   public HexagonalPrismList(String listNameIn,
      ArrayList<HexagonalPrism> hPListIn)
   {
      listName = listNameIn;
      hPList = hPListIn;
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
      return hPList.size();
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
         while (i < hPList.size())
         {
            total += hPList.get(i).surfaceArea();
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
         while (i < hPList.size())
         {
            total += hPList.get(i).volume();
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
         while (i < hPList.size())
         {
            total += hPList.get(i).basePerimeter();
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
         while (i < hPList.size())
         {
            total += hPList.get(i).baseArea();
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
         while (i < hPList.size())
         {
            total += hPList.get(i).surfaceArea();
            i++;
         }
         double average = total / hPList.size();
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
         while (i < hPList.size())
         {
            total += hPList.get(i).volume();
            i++;
         }
         double average = total / hPList.size();
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
      while (i < hPList.size())
      {
         result += "\n" + hPList.get(i) + "\n";
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
}