/**
 * Stores information for softball player, infielder.
 *
 * Project #9
 * @author Justin Sawyer
 * @version 04-14-2016
**/
public class Infielder extends SoftballPlayer
{
   private double infielderFieldingAvg;
   
   /**
    * Takes in number, name, position, specializaton factor, and batting avg.
    * @param numberIn for number
    * @param nameIn for name
    * @param positionIn for position
    * @param specializationFactorIn for specialzationFactor
    * @param battingAvgIn for battingAvg
    * @param infielderFieldingAvgIn for infielderFieldingAvg
   **/
   public Infielder(String numberIn, String nameIn, String positionIn,
      double specializationFactorIn, double battingAvgIn,
      double infielderFieldingAvgIn)
   {
      super(numberIn, nameIn, positionIn, specializationFactorIn,
         battingAvgIn);
      infielderFieldingAvg = infielderFieldingAvgIn;
   }
   
   /**
    * Return infielder fielding average.
    *
    * @return double infielderFieldingAvg
   **/
   public double getInfielderFieldingAvg()
   {
      return infielderFieldingAvg;
   }
   
   /**
    * Changes infielder fielding average.
    *
    * @param infielderFieldingAvgIn for infielderFieldingAvg
   **/
   public void setInfielderFieldingAvg(double infielderFieldingAvgIn)
   {
      infielderFieldingAvg = infielderFieldingAvgIn;
   }
   
   /**
    * Return player rating.
    *
    * @return double rating
   **/
   public double rating()
   {
      return BASE_RATING * specializationFactor * battingAvg 
         * infielderFieldingAvg;
   }
}