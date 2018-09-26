import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests ReliefPitcher class methods.
**/
public class ReliefPitcherTest 
{


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp()
   {
   
   }


   /** Tests getSaves(). **/
   @Test public void getSavesTest()
   {
      SoftballPlayer.resetCount();
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      p4.setSaves(50);
      Assert.assertEquals("", 50, p4.getSaves());
   }
   
   /** Tests rating(). **/
   @Test public void ratingTest()
   {
      SoftballPlayer.resetCount();
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      Assert.assertEquals("", 2.474, p4.rating(), 0.001);
   }
   
   /** Tests stats(). **/
   @Test public void statsTest()
   {
      SoftballPlayer.resetCount();
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      Assert.assertEquals("", p4.toString(), p4.stats());
   }
}
