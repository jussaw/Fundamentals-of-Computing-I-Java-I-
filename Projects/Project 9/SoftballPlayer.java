import java.text.DecimalFormat;
/**
 * Abstract class to store information for softball player.
 *
 * Project #9
 * @author Justin Sawyer
 * @version 04-14-2016
**/
public abstract class SoftballPlayer
{
   protected String number, name, position;
   protected double specializationFactor, battingAvg;
   protected static int count = 0;
   protected static final int BASE_RATING = 10;
   
   /**
    * Takes in number, name, position, specializaton factor, and batting avg.
    * @param numberIn for number
    * @param nameIn for name
    * @param positionIn for position
    * @param specializationFactorIn for specialzationFactor
    * @param battingAvgIn for battingAvg
   **/
   public SoftballPlayer(String numberIn, String nameIn, String positionIn,
      double specializationFactorIn, double battingAvgIn)
   {
      number = numberIn;
      name = nameIn;
      position = positionIn;
      specializationFactor = specializationFactorIn;
      battingAvg = battingAvgIn;
      count++;
   }
   
   /**
    * Return players number.
    * @return number
   **/
   public String getNumber()
   {
      return number;
   }
   
   /**
    * Changes number.
    *
    * @param numberIn for number
   **/
   public void setNumber(String numberIn)
   {
      number = numberIn;
   }
   
   /**
    * Returns player name.
    *
    * @return name
   **/
   public String getName()
   {
      return name;
   }
   
   /**
    * Changes player name.
    *
    * @param nameIn for name
   **/
   public void setName(String nameIn)
   {
      name = nameIn;
   }
   
   /**
    * Return player position.
    *
    * @return position
   **/
   public String getPosition()
   {
      return position;
   }
   
   /**
    * Changes player position.
    * 
    * @param positionIn for position
   **/
   public void setPosition(String positionIn)
   {
      position = positionIn;
   }
   
   /**
    * Return player batting average.
    *
    * @return battingAvg
   **/
   public double getBattingAvg()
   {
      return battingAvg;
   }
   
   /**
    * Changes player batting average.
    * 
    * @param battingAvgIn for battingAvg
   **/
   public void setBattingAvg(double battingAvgIn)
   {
      battingAvg = battingAvgIn;
   }
   
   /**
    * Return player specialization factor.
    *
    * @return specializationFactor
   **/
   public double getSpecializationFactor()
   {
      return specializationFactor;
   }
   
   /**
    * Changes player specializationFactor.
    *
    * @param specializationFactorIn for specializationFactor
   **/
   public void setSpecializationFactor(double specializationFactorIn)
   {
      specializationFactor = specializationFactorIn;
   }
   
   /**
    * Returns the amount of Softball players.
    * 
    * @return count
   **/
   public static int getCount()
   {
      return count;
   }
   
   /**
    * Resets the amount of softball players to 0.
   **/
   public static void resetCount()
   {
      count = 0;
   }
   
   /**
    * Returns player stats.
    *
    * @return stats()
   **/
   public String stats()
   {
      DecimalFormat proper = new DecimalFormat("0.000");
      DecimalFormat stat = new DecimalFormat(".000");
      DecimalFormat specFac = new DecimalFormat("0.0");
      return number + " " + name + " (" + position + ") "
         + stat.format(battingAvg) + "\nSpecialization Factor: "
         + specFac.format(specializationFactor) + " (" + this.getClass() 
         + ") Rating: " + proper.format(rating());
   }
   
   /**
    * Returns information on SoftballPlayer.
    *
    * @return toString()
   **/
   public String toString()
   {
      return this.stats();
   }
   
   /**
    * Abstract class for rating of player.
    *
    * @return double rating
   **/
   public abstract double rating();
}