import java.text.DecimalFormat;

/**
 * Stores information for softball player, pitcher, relief pitcher.
 *
 * Project #9
 * @author Justin Sawyer
 * @version 04-14-2016
**/
public class ReliefPitcher extends Pitcher
{
   private int saves;
   
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
    * @param savesIn for saves
   **/
   public ReliefPitcher(String numberIn, String nameIn, String positionIn,
      double specializationFactorIn, double battingAvgIn, int winsIn,
      int lossesIn, double eraIn, int savesIn)
   {
      super(numberIn, nameIn, positionIn, specializationFactorIn,
         battingAvgIn, winsIn, lossesIn, eraIn);
      saves = savesIn;
   }
   
   /**
    * Return saves.
    *
    * @return double saves
   **/
   public int getSaves()
   {
      return saves;
   }
   
   /**
    * Changes saves.
    *
    * @param savesIn for saves
   **/
   public void setSaves(int savesIn)
   {
      saves = savesIn;
   }
   
   /**
    * Return player rating.
    *
    * @return double rating
   **/
   public double rating()
   {
      return BASE_RATING * specializationFactor * (1 / (1 + era))
         * ((wins - losses + saves) / 30.0);
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
         + wins + " wins, " + losses + " losses, " + saves + " saves, "
         + era + " ERA" + "\nSpecialization Factor: "
         + specFac.format(specializationFactor) + " (" + this.getClass() 
         + ") Rating: " + proper.format(rating());
   }
}
