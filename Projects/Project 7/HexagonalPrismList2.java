import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
  *Stores information of a hexagonal prism list.
  *
  *Project #7A
  *@author Justin Sawyer
  *@version 03-31-16
  */
public class HexagonalPrismList2
{
   //Fields
   private String listName = "";
   private HexagonalPrism[] list = new HexagonalPrism[100];
   private int numberElements = 0;
   
   /**
     *Initializes a HexagonalPrismList object given the list name and list.
     *     
     *@param listNameIn List name
     *@param listIn HexagonalPrism Array
     *@param numberElementsIn Number of Elements in Array
     */
   public HexagonalPrismList2(String listNameIn,
                              HexagonalPrism[] listIn, int numberElementsIn)
   {
      listName = listNameIn;
      list = listIn;
      numberElements = numberElementsIn;
   }
   
   /**
     *Initializes a HexagonalPrismList object given the list name and list.
     *     
     *@param listNameIn List name
     *@param numberElementsIn Number of Elements in Array
     */
   public HexagonalPrismList2(String listNameIn, int numberElementsIn)
   {
      listName = listNameIn;
      numberElements = numberElementsIn;
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
      return numberElements;
   }
   
   /**
     *Adds all the surface areas.
     *     
     *@return double The total of all the surface areas,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double totalSurfaceArea()
   {
      double total = 0.0;
      for (int i = 0; i < numberOfHexagonalPrisms(); i++)
      {
         total += list[i].surfaceArea();
      }
      return total;
   }
   
   /**
     *Adds all the volumes.
     *     
     *@return double The total of all the volumes,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double totalVolume()
   {
      double total = 0.0;
      for (int i = 0; i < numberOfHexagonalPrisms(); i++)
      {
         total += list[i].volume();
      }
      return total;
   }
   
   /**
     *Adds all the base perimeters.
     *     
     *@return double The total of all the base perimeters,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double totalBasePerimeter()
   {
      double total = 0.0;
      for (int i = 0; i < numberOfHexagonalPrisms(); i++)
      {
         total += list[i].basePerimeter();
      }
      return total;
   }
   
   /**
     *Adds all the base areas.
     *     
     *@return double The total of all the volumes,
     *or returns 0 if there are no base areas.
     */
   public double totalBaseArea()
   {
      double total = 0.0;
      for (int i = 0; i < numberOfHexagonalPrisms(); i++)
      {
         total += list[i].baseArea();
      }
      return total;
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
      double averageSurfaceArea = 0.0;
      if (numberOfHexagonalPrisms() != 0)
      {
         averageSurfaceArea = totalSurfaceArea() / numberOfHexagonalPrisms();
      }
      return averageSurfaceArea;
   }
   
   /**
     *Adds all the volumes then divides by the amount of hexagonal prisms.
     *     
     *@return double The average of all the volumes,
     *or returns 0 if there are no hexagonal prisms.
     */
   public double averageVolume()
   {
      double averageVolume = 0.0;
      if (numberOfHexagonalPrisms() != 0)
      {
         averageVolume = totalVolume() / numberOfHexagonalPrisms();
      }
      return averageVolume;
   }
   
   /**
     *@return String toString.
     */
   public String toString()
   {
      int i = 0;
      String result = "\n" + listName + "\n";
      while (i < numberOfHexagonalPrisms())
      {
         result += "\n" + list[i] + "\n";
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
     *@return HexagonalPrism[]
     */
   public HexagonalPrism[] getList()
   {
      return list;
   }
   
   /**
     *Reads in file for a hexagonal prism list and returns object for it.
     *
     *@param nameIn for name
     *@throws IOException from scanning input file.
     *@return HexagonalPrismList2
     */
   public HexagonalPrismList2 readFile(String nameIn) throws IOException
   {
      Scanner scanFile = new Scanner(new File(nameIn));
      HexagonalPrism[] myList = new HexagonalPrism[100];
      HexagonalPrism[] myList2;
      String name = "";
      double side = 0, height = 0;
      int numOfElem = 0;
      
      listName = scanFile.nextLine(); 
      while (scanFile.hasNext())
      {
         name = scanFile.nextLine();
         side = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         HexagonalPrism hP = new HexagonalPrism(name, side, height);
         myList[numOfElem] = hP;
         numOfElem++;
      }
      
      myList2 = new HexagonalPrism[numOfElem];
      
      for (int i = 0; i < myList2.length; i++)
      {
         myList2[i] = myList[i];
      }
      
      numberElements = numOfElem;
      myList = myList2;
      HexagonalPrismList2 hpL = new 
         HexagonalPrismList2(listName, myList, numOfElem);
      return hpL;
   }
   
   /**
     *Adds HexagonalPism object to list.
     *
     *@param labelIn of new HexagonalPrism object
     *@param sideIn of new HexagonalPrism object
     *@param heightIn of new HexagonalPrism object
     */
   public void addHexagonalPrism(String labelIn, double sideIn, double heightIn)
   {
      HexagonalPrism hP = new HexagonalPrism(labelIn, sideIn, heightIn);
      HexagonalPrism[] myList = 
         new HexagonalPrism[numberOfHexagonalPrisms() + 1];
      
      for (int i = 0; i < numberOfHexagonalPrisms(); i++)
      {
         myList[i] = list[i];
      }
      
      numberElements++;
      myList[myList.length - 1] = hP;
      list = myList;
   }
   
   /**
     *Deletes HexagonalPrism object form list.
     *
     *@param labelIn of HexagonalPrism object
     *@return HexagonalPrism 
     */
   public HexagonalPrism deleteHexagonalPrism(String labelIn)
   {
      HexagonalPrism hP = null;
      int i = 0;
      
      while (i < numberOfHexagonalPrisms())
      {
         if (list[i].getLabel().equalsIgnoreCase(labelIn))
         {
            hP = list[i];
            for (int j = i; j < numberOfHexagonalPrisms() - 1; j++) 
            {
               list[j] = list[j + 1];
            }
            numberElements--;
         }
         i++;
      }     
     
      return hP;
   }
   
   /**
     *Finds HexagonalPrism object.
     *
     *@param labelIn of HexagonalPrism object
     *@return HexagonalPrism
     */
   public HexagonalPrism findHexagonalPrism(String labelIn)
   {
      HexagonalPrism hP = null;
      int i = 0;
      
      while (i < numberOfHexagonalPrisms())
      {
         if (list[i].getLabel().equalsIgnoreCase(labelIn))
         {
            hP = list[i];
         }
         i++;
      }
      
      return hP;
   }
   
   /**
     *Edits HexagonalPrism objct.
     *
     *@param labelIn of HexagonalPrism object
     *@param sideIn of HexagonalPrism object
     *@param heightIn of HexagonalPrism object
     *@return boolean
     */
   public boolean editHexagonalPrism(String labelIn,
                                       double sideIn, double heightIn)
   {
      boolean result = false;
      int i = 0;
      while (i < numberOfHexagonalPrisms())
      {
         if (list[i].getLabel().equalsIgnoreCase(labelIn))
         {
            list[i].setSide(sideIn);
            list[i].setHeight(heightIn);
            result = true;
         }
         i++;
      }
      return result;
   }
   
   /**
     *Finds HexagonalPrism object with smallest side.
     *
     *@return HexagonalPrism with smallest side.
     */
   public HexagonalPrism findHexagonalPrismWithSmallestSide()
   {
      HexagonalPrism hP = list[0];
      
      if (numberOfHexagonalPrisms() > 0)
      {
         for (int i = 1; i < numberOfHexagonalPrisms(); i++)
         {
            if (list[i].getSide() < hP.getSide())
            {
               hP = list [i];
            }
         }
      }
      return hP;
   }
   
   /**
     *Finds HexagonalPrism object with largest side.
     *
     *@return HexagonalPrism with largest side.
     */
   public HexagonalPrism findHexagonalPrismWithLargestSide()
   {
      HexagonalPrism hP = list[0];
      
      if (numberOfHexagonalPrisms() > 0)
      {
         for (int i = 1; i < numberOfHexagonalPrisms(); i++)
         {
            if (list[i].getSide() > hP.getSide())
            {
               hP = list[i];
            }
         }
      }
      return hP;
   }
   
   /**
     *Finds HexagonalPrism object with smallest height.
     *
     *@return HexagonalPrism with smallest height.
     */
   public HexagonalPrism findHexagonalPrismWithSmallestHeight()
   {
      HexagonalPrism hP = list[0];
      
      if (numberOfHexagonalPrisms() > 0)
      {
         for (int i = 1; i < numberOfHexagonalPrisms(); i++)
         {
            if (list[i].getHeight() < hP.getHeight())
            {
               hP = list [i];
            }
         }
      }
      return hP;
   }
   
   /**
     *Finds HexagonalPrism object with largest height.
     *
     *@return HexagonalPrism with largest height.
     */
   public HexagonalPrism findHexagonalPrismWithLargestHeight()
   {
      HexagonalPrism hP = list[0];
      
      if (numberOfHexagonalPrisms() > 0)
      {
         for (int i = 1; i < numberOfHexagonalPrisms(); i++)
         {
            if (list[i].getHeight() > hP.getHeight())
            {
               hP = list [i];
            }
         }
      }
      return hP;
   }
}