import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**Tests Heagonal Prism class methods.
  *
  */
public class HexagonalPrismTest 
{


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() 
   {
   }


   /** Tests getLabel(). **/
   @Test public void getLabelTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", "example", hp.getLabel());
   }
   
   /** Tests setLabel(). **/
   @Test public void setLabelTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", true, hp.setLabel("new"));
   }
   
   /** Tests getSide(). **/
   @Test public void getSideTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", 10.0, hp.getSide(), .0001);
   }
   
   /** Tests getHeight(). **/
   @Test public void getHeightTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", 15.0, hp.getHeight(), .0001);
   }
   
   /** Tests basePerimeter(). **/
   @Test public void basePerimeterTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", 60, hp.basePerimeter(), .0001);
   }
   
   /** Tests baseArea(). **/
   @Test public void baseAreaTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", 259.8076211353316, hp.baseArea(), .0001);
   }
   
   /** Tests volume(). **/
   @Test public void volumeTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", 3897.114317029974, hp.volume(), .0001);
   }
   
   /** Tests surfaceArea(). **/
   @Test public void surfaceAreaTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", 1419.6152422706632, hp.surfaceArea(), .0001);
   }
   
   /** Tests toString(). **/
   @Test public void toStringTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example", 10, 15);
      Assert.assertEquals("", "\"example\" is a hexagonal "
         + "prism with side = 10.0 "
         + "units and height = 15.0 units,"
         + "\nwhich has base perimeter = 60.0 units, base area = 259.808 "
         + "square units,"
         + "\nsurface area = 1,419.615 square units, and volume = 3,897.114 "
         + "cubic units.", hp.toString());
   }
   
   /** Tests getCount(). **/
   @Test public void getCountTest() 
   {
      HexagonalPrism.resetCount();
      
      HexagonalPrism hp1 = new HexagonalPrism("example1", 10, 15);
      HexagonalPrism hp2 = new HexagonalPrism("example2", 8, 11);
      HexagonalPrism hp3 = new HexagonalPrism("example3", 47, 8);
      
      Assert.assertEquals("", 3, HexagonalPrism.getCount());
   }
   
   /** Tests equals(). **/
   @Test public void equalsTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp1 = new HexagonalPrism("example1", 10, 15);
      HexagonalPrism hp2 = new HexagonalPrism("example1", 10, 15);
      Assert.assertEquals("", true, hp1.equals(hp2));
   }
   
   /** Tests hashCode(). **/
   @Test public void hashCodeTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hp = new HexagonalPrism("example1", 10, 15);
      Assert.assertEquals("", 0, hp.hashCode());
   }
}
