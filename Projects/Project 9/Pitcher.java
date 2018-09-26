import java.text.DecimalFormat;

/**
 * Stores information for softball player, pitcher.
 *
 * Project #9
 * @author Justin Sawyer
 * @version 04-14-2016
**/
public class Pitcher extends SoftballPlayer
{
   protected int wins, losses;
   protected double era; //earned run average
   
   /**
    * Takes in number, name, position, specializaton factor, and batting avg.
    * @param numberIn for number
    * @param nameIn for name
    * @param positionIn for position
    * @param specializationFactorIn for specialzationFactor
    * @param battingAvgIn for battingAvg
    * @param winsIn for wins
    * @param lossesIn for losses
    * @param eraIn for era
   **/
   public Pitcher(String numberIn, String nameIn, String positionIn,
      double specializationFactorIn, double battingAvgIn, int winsIn,
      int lossesIn, double eraIn)
   {
      super(numberIn, nameIn, positionIn, specializationFactorIn,
         battingAvgIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   }
   
   /**
    * Return wins.
    *
    * @return double wins
   **/
   public int getWins()
   {
      return wins;
   }
   
   /**
    * Changes wins.
    *
    * @param winsIn for wins
   **/
   public void setWins(int winsIn)
   {
      wins = winsIn;
   }
   
   /**
    * Return losses.
    *
    * @return double losses
   **/
   public int getLosses()
   {
      return losses;
   }
   
   /**
    * Changes losses.
    *
    * @param lossesIn for losses
   **/
   public void setLosses(int lossesIn)
   {
      losses = lossesIn;
   }
   
   /**
    * Return earned run average.
    *
    * @return double era
   **/
   public double getEra()
   {
      return era;
   }
   
   /**
    * Changes pitcher earned run average.
    *
    * @param eraIn for era
   **/
   public void setEra(double eraIn)
   {
      era = eraIn;
   }
   
   /**
    * Return player rating.
    *
    * @return double rating
   **/
   public double rating()
   {
      return BASE_RATING * specializationFactor * (1 / (1 + era))
         * ((wins - losses) / 25.0);
   }
   
   /**
    * Returns player stats.
    *
    * @return stats()
   **/
   public String stats()
   {
      DecimalFormat proper = new DecimalFormat("0.000");
      DecimalFormat specFac = new DecimalFormat("0.0");
      return number + " " + name + " (" + position + ") "
         + wins + " wins, " + losses + " losses, " + era + " ERA"
         + "\nSpecialization Factor: "
         + specFac.format(specializationFactor) + " (" + this.getClass() 
         + ") Rating: " + proper.format(rating());
   }
}