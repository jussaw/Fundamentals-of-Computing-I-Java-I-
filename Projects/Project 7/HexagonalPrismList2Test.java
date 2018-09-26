import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.text.DecimalFormat;

/**Tests HexagonalPrismList2 class methods.
  *
  */
public class HexagonalPrismList2Test 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() 
   {
   }
   
   /** Tests getName(). **/
   @Test public void getNameTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", "Hexagonal Prism List", list.getName());
   }
   
   /** Tests numberOfHexagonalPrisms(). **/
   @Test public void numberOfHexagonalPrismsTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", 4, list.numberOfHexagonalPrisms());
   }
   
   /** Tests totalSurfaceArea(). **/
   @Test public void totalSurfaceAreaTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
         
      double totalSurfaceArea = 0.0;
      for (int i = 0; i < hPList.length; i++)
      {
         totalSurfaceArea += hPList[i].surfaceArea();
      }
      
      Assert.assertEquals("", totalSurfaceArea, list.totalSurfaceArea(),
         0.0001);
   }
   
   /** Tests totalVolume(). **/
   @Test public void totalVolumeTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      double totalVolume = 0.0;
      for (int i = 0; i < hPList.length; i++)
      {
         totalVolume += hPList[i].volume();
      }
      
      Assert.assertEquals("", totalVolume, list.totalVolume(), 0.1);
   }
   
   /** Tests totalBasePerimeter(). **/
   @Test public void totalBasePerimeterTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      double totalBasePerimeter = 0.0;
      for (int i = 0; i < hPList.length; i++)
      {
         totalBasePerimeter += hPList[i].basePerimeter();
      }  
      
      Assert.assertEquals("", totalBasePerimeter,
         list.totalBasePerimeter(), 0.0001);
   }
   
   /** Tests totalBaseArea(). **/
   @Test public void totalBaseArearTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      double totalBaseArea = 0.0;
      for (int i = 0; i < hPList.length; i++)
      {
         totalBaseArea += hPList[i].baseArea();
      }  
      
      Assert.assertEquals("", totalBaseArea,
         list.totalBaseArea(), 0.0001);
   }
   /** Tests averageSurfaceArea(). **/
   @Test public void averageSurfaceAreaTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      double totalSurfaceArea = 0.0, averageSurfaceArea = 0.0;
      for (int i = 0; i < hPList.length; i++)
      {
         totalSurfaceArea += hPList[i].surfaceArea();
         averageSurfaceArea =
            totalSurfaceArea / list.numberOfHexagonalPrisms();
      }  
      
      Assert.assertEquals("", averageSurfaceArea,
         list.averageSurfaceArea(), 0.0001);
   }
   
   /** Tests averageVolume(). **/
   @Test public void averageVolumeTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      double totalVolume = 0.0, averageVolume = 0.0;
      for (int i = 0; i < hPList.length; i++)
      {
         totalVolume += hPList[i].volume();
         averageVolume =
            totalVolume / list.numberOfHexagonalPrisms();
      }  
      
      Assert.assertEquals("", averageVolume,
         list.averageVolume(), 0.0001);
   }
   
   /** Tests toString(). **/
   @Test public void toStringTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      String output =  "\n" + list.getName() + "\n";
      int i = 0;
      while (i < list.numberOfHexagonalPrisms())
      {
         output += "\n" + hPList[i].toString() + "\n";
         i++;
      }
      
      Assert.assertEquals("", output, list.toString());
   }
   
   /** Tests summaryInfo(). **/
   @Test public void summaryInfoTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      DecimalFormat standard = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "----- " + list.getName() + " Summary" + " -----"
         + "\nNumber of Hexagonal Prisms: "
         + list.numberOfHexagonalPrisms()
         + "\nTotal Surface Area: "
         + standard.format(list.totalSurfaceArea())
         + "\nTotal Volume: "  + standard.format(list.totalVolume())
         + "\nTotal Base Perimeter: " 
         + standard.format(list.totalBasePerimeter())
         + "\nTotal Base Area: "  + standard.format(list.totalBaseArea())
         + "\nAverage Surface Area: " 
         + standard.format(list.averageSurfaceArea())
         + "\nAverage Volume: "  + standard.format(list.averageVolume());
      
      Assert.assertEquals("", output, list.summaryInfo());
   }
   
   /** Tests getList(). **/
   @Test public void getListTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertArrayEquals("", hPList, list.getList());
   }
   
   /** Tests readFileTest(). 
     *
     *@throws IOException from scanning input file.
     */
   @Test public void readFileTest() throws IOException
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short Example", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide Example", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall Example", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large Example",
         300, 400);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List 1", hPList, 4);
      
      String hpListName = "no list name";
      HexagonalPrism [] myList = new HexagonalPrism[100];
      int numberElements = 0;
      HexagonalPrismList2 myHpList =
         new HexagonalPrismList2(hpListName, myList, numberElements);
      myHpList = myHpList.readFile("hexagonal_prism_1.dat");
      
      
      Assert.assertEquals("", list.toString(), myHpList.toString());
   }
   
   /** Tests deleteHexagonalPrism(). **/
   @Test public void deleteHexagonalPrismTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", hP2, list.deleteHexagonalPrism("Wide"));
   }
   
   /** Tests findHexagonalPrism(). **/
   @Test public void findHexagonalPrismTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", hP1, list.findHexagonalPrism("Short"));
   }
   
   /** Tests editHexagonalPrism(). **/
   @Test public void editHexagonalPrismTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", true,
         list.editHexagonalPrism("Tall", 55.1, 45.5));
   }
   
   /** Tests findHexagonalPrismWithSmallestSide(). **/
   @Test public void findHexagonalPrismWithSmallestSideTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", hP1, list.findHexagonalPrismWithSmallestSide());
   }
   /** Tests FindHexagonalPrismWithLargestside(). **/
   @Test public void findHexagonalPrismWithLargestSideTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", hP4, list.findHexagonalPrismWithLargestSide());
   }
   
   /** Tests findHexagonalPrismWithSmallestHeight(). **/
   @Test public void findHexagonalPrismWithSmallestHeightTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", hP1,
         list.findHexagonalPrismWithSmallestHeight());
   }
   
   /** Tests findHexagonalPrismWithLargestHeight(). **/
   @Test public void findHexagonalPrismWithLargestHeightTest() 
   {
      HexagonalPrism.resetCount();
      HexagonalPrism hP1 = new HexagonalPrism("Short", 4.0, 6.0);
      HexagonalPrism hP2 = new HexagonalPrism("Wide", 22.1, 10.6);
      HexagonalPrism hP3 = new HexagonalPrism("Tall", 10.0, 200.0);
      HexagonalPrism hP4 = new HexagonalPrism("Really Large", 300.0, 400.0);
      HexagonalPrism[] hPList = new HexagonalPrism[4];
      hPList[0] = hP1;
      hPList[1] = hP2;
      hPList[2] = hP3;
      hPList[3] = hP4;
      HexagonalPrismList2 list = new 
         HexagonalPrismList2("Hexagonal Prism List", hPList, 4);
      
      Assert.assertEquals("", hP4, list.findHexagonalPrismWithLargestHeight());
   }
}