import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SoftballPlayersPart1Test 
{


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp()
   {
   
   }


   /** Tests main(). **/
   @Test public void defaultTest()
   {
      SoftballPlayer.resetCount();
      SoftballPlayersPart1.main(null);
      Assert.assertEquals("Player.count should be 4. ",
         4, SoftballPlayer.getCount());
   }
}
