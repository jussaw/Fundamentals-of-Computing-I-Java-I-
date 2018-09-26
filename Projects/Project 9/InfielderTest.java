import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests Infielder class methods.
**/
public class InfielderTest 
{


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp()
   {
   
   }


   /** Tests getInfielderFieldingAvg(). **/
   @Test public void getInfielderFieldingAvgTest()
   {
      SoftballPlayer.resetCount();
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B",
          1.25, .275, .850);
      p2.setInfielderFieldingAvg(.872);
      Assert.assertEquals("", 0.872, p2.getInfielderFieldingAvg(), 0.001);
   }
   
   /** Tests rating(). **/
   @Test public void ratingTest()
   {
      SoftballPlayer.resetCount();
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B",
          1.25, .275, .850);
      Assert.assertEquals("", 2.922, p2.rating(), 0.001);
   }
}
