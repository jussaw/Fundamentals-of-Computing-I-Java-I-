import java.text.DecimalFormat;
/**
 *Stores information of a hexagonal prism and finds its base perimeter,
 *surface area, and volume.
 *
 *Project #4
 *@author Justin Sawyer
 *@version 02-08-16
 */
public class HexagonalPrism
{
   //Fields
   private String label;
   private double side, height;
   
   /**
    *@param labelIn for label
    *@param sideIn for side
    *@param heightIn for height
    */
   public HexagonalPrism(String labelIn, double sideIn, double heightIn)
   {
      labelIn = labelIn.trim();
      label = labelIn;
      side = sideIn;
      height = heightIn;
   }
   
   /**
    *@return String label
    */
   public String getLabel()
   {
      return label;
   }
   
   /**
    *@param labelIn2 for labelIn
    *@return boolean
    */
   public boolean setLabel(String labelIn2)
   {
      if (labelIn2 == null)
      {
         return false;
      }
      else
      {
         labelIn2 = labelIn2.trim();
         label = labelIn2;
         return true;
      }
   }
   
   /**
    *@return double side
    */
   public double getSide()
   {
      return side;
   }
   
   /**
    *@param sideIn for side
    */
   public void setSide(double sideIn)
   {
      side = sideIn;
   }
   
   /**
    *@return double height
    */
   public double getHeight()
   {
      return height;
   }
   
   /**
    *@param heightIn for height
    */
   public void setHeight(double heightIn)
   {
      height = heightIn;
   }
   
   /**
    *@return double basePerimeter
    */
   public double basePerimeter()
   {
      double perimeter = 6 * side;
      return perimeter;
   }
   
   /**
    *@return double bArea
    */
   public double baseArea()
   {
      double bArea = 3 * Math.sqrt(3) * (Math.pow(side, 2) / 2);
      return bArea;
   }
   
   /**
    *@return double surfArea
    */
   public double surfaceArea()
   {
      double sArea = (6 * side * height)
                        + (3 * Math.sqrt(3) * Math.pow(side, 2));
      return sArea;
   }
   
   /**
    *@return double volume2
    */
   public double volume()
   {
      double volume2 = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2) * height;
      return volume2;
   }
   
   /**
    *@return String toString
    */
   public String toString()
   {
      DecimalFormat value = new DecimalFormat("#,##0.0##");
      String output;
      output = "\"" + label + "\"" + " is a hexagonal prism with side = "
         + value.format(getSide()) + " units and height = "
         + value.format(getHeight()) + " units,\n"
         + "which has base perimeter = " + value.format(basePerimeter())
         + " units, base area = " + value.format(baseArea())
         + " square units,\n"
         + "surface area = " + value.format(surfaceArea())
         + " square units, and volume = " + value.format(volume())
         + " cubic units.";
      return output;
   }
}