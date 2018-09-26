/**
 * Driver for Softball Player class and subclasses.
 *
 * Project #9
 * @author Justin Sawyer
 * @version 04-14-2016
**/
public class SoftballPlayersPart1
{
   /**
     *Prints to std output.
     *
     *@param args Command line arguments (not used).
     */
   public static void main(String[] args)
   {
      SoftballPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF",
         1.0, .375, .950);
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B",
          1.25, .275, .850);
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP",
         2.0, .125, 22, 4, 2.85);
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP",
         2.0, .125, 5, 4, 3.85, 17);
      
      System.out.print(p1 + "\n\n" + p2 + "\n\n" + p3 + "\n\n" + p4);
   }
}