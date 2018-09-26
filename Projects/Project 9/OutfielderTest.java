import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests Outfielder class methods.
**/
public class OutfielderTest 
{


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() 
   {
   
   }


   /** Tests getOutfliederFieldingAvg(). **/
   @Test public void getOutfielderFieldingAvgTest() 
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      p1.setOutfielderFieldingAvg(0.87);
      Assert.assertEquals("", 0.87, p1.getOutfielderFieldingAvg(), 0.001);
   }
   
   /** Tests rating(). **/
   @Test public void ratingTest() 
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Assert.assertEquals("", 3.562, p1.rating(), 0.001);
   }
   
   /** Tests getNumber(). **/
   @Test public void getNumberTest()
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      p1.setNumber("42");
      Assert.assertEquals("", "42", p1.getNumber());
   }
   
   /** Tests getName(). **/
   @Test public void getNameTest()
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      p1.setName("Bob Doe");
      Assert.assertEquals("", "Bob Doe", p1.getName());
   }
   
   /** Tests getPosition(). **/
   @Test public void gettPositionTest()
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      p1.setPosition("LR");
      Assert.assertEquals("","LR", p1.getPosition());
   }
   
   /** Tests getBattingAvg(). **/
   @Test public void getBattingAvgTest()
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      p1.setBattingAvg(.420);
      Assert.assertEquals("", .420, p1.getBattingAvg(), 0.001);
   }
   
   /** Tests getSpecializationFactor(). **/
   @Test public void getSpecializationFactorTest()
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      p1.setSpecializationFactor(1.2);
      Assert.assertEquals("", 1.2, p1.getSpecializationFactor(), 0.001);   
   }
   
   /** Tests getCount(). **/
   @Test public void getCountTest()
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Outfielder p2 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Outfielder p3 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Outfielder p4 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Assert.assertEquals("", 4, SoftballPlayer.getCount(), 0.001);   
   }
   
   /** Tests stats(). **/
   @Test public void statsTest()
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Assert.assertEquals("", p1.toString(), p1.stats());   
   }
}
