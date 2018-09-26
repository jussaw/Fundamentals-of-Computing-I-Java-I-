/**
 * Stores information for softball player, outfielder.
 *
 * Project #9
 * @author Justin Sawyer
 * @version 04-14-2016
**/
public class Outfielder extends SoftballPlayer
{
   private double outfielderFieldingAvg;
   
   /**
    * Takes in number, name, position, specializaton factor, and batting avg.
    * @param numberIn for number
    * @param nameIn for name
    * @param positionIn for position
    * @param specializationFactorIn for specialzationFactor
    * @param battingAvgIn for battingAvg
    * @param outfielderFieldingAvgIn for outfielderFieldingAvg
   **/
   public Outfielder(String numberIn, String nameIn, String positionIn,
      double specializationFactorIn, double battingAvgIn, 
      double outfielderFieldingAvgIn)
   {
      super(numberIn, nameIn, positionIn, specializationFactorIn,
         battingAvgIn);
      outfielderFieldingAvg = outfielderFieldingAvgIn;
   }
   
   /**
    * Return outfielder fielding average.
    *
    * @return double outfielderFieldingAvg
   **/
   public double getOutfielderFieldingAvg()
   {
      return outfielderFieldingAvg;
   }
   
   /**
    * Changes outfielder fielding average.
    *
    * @param outfielderFieldingAvgIn for outfielderFieldingAvg
   **/
   public void setOutfielderFieldingAvg(double outfielderFieldingAvgIn)
   {
      outfielderFieldingAvg = outfielderFieldingAvgIn;
   }
   
   /**
    * Return player rating.
    *
    * @return double rating
   **/
   public double rating()
   {
      return BASE_RATING * specializationFactor * battingAvg 
         * outfielderFieldingAvg;
   }
}