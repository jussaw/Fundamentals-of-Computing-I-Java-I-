import java.text.DecimalFormat;
/**
  *Stores information of a hexagonal prism and finds its base perimeter,
  *surface area, and volume.
  *
  *Project #7A
  *@author Justin Sawyer
  *@version 03-31-16
  */
public class HexagonalPrism
{
   //Fields
   private String label;
   private double side, height;
   private static int count = 0;
   
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
      count++;
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
      boolean output = false;
   
      if (labelIn2 != null)
      {
         labelIn2 = labelIn2.trim();
         label = labelIn2;
         output = true;
      }
      
      return output;
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
   
   /**
     *@return int count
     */
   public static int getCount()
   {
      return count;
   }
   
   /** 
     *Resets static int count.
     */
   public static void resetCount()
   {
      count = 0;
   }
   
   /**
     *@param obj 
     *
     *@return boolean
     */
   public boolean equals(Object obj)
   {
      boolean output = obj instanceof HexagonalPrism;
      if (output)
      {
         HexagonalPrism c = (HexagonalPrism) obj;
         output = (label.equals(c.getLabel())
                  && Math.abs(side - c.getSide()) < .00001
                  && Math.abs(height - c.getHeight()) < .00001);
      }
      return output;
   }
   
   /**
     *@return int 0.
     */
   public int hashCode()
   {
      return 0;
   }
}