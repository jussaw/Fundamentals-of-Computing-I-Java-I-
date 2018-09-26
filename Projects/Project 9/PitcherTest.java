import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests Pitcher class methods.
**/
public class PitcherTest 
{


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() 
   {
   
   }


   /** Tests getWins(). **/
   @Test public void getWinsTest() 
   {
      SoftballPlayer.resetCount();
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      p3.setWins(32);
      Assert.assertEquals("", 32, p3.getWins());
   }
   
   /** Tests getLosses(). **/
   @Test public void getLossesTest() 
   {
      SoftballPlayer.resetCount();
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      p3.setLosses(320);
      Assert.assertEquals("", 320, p3.getLosses());
   }
   
   /** Tests getEra(). **/
   @Test public void getEraTest() 
   {
      SoftballPlayer.resetCount();
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      p3.setEra(2.72);
      Assert.assertEquals("", 2.72, p3.getEra(), 0.001);
   }
   
   /** Tests rating(). **/
   @Test public void ratingTest() 
   {
      SoftballPlayer.resetCount();
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      Assert.assertEquals("", 3.740, p3.rating(), 0.001);
   }
   
   /** Tests stats(). **/
   @Test public void statsTest() 
   {
      SoftballPlayer.resetCount();
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      Assert.assertEquals("", p3.toString(), p3.stats());
   }
}
