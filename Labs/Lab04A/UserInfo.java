/**
 *Stores information of user, including name, location, agg,
 *and status (whether offline or online.
 *
 *@author Justin Sawyer
 *@version 02-07-16
 */
public class UserInfo
{
   //Fields
   private String firstName, lastName, location;
   private int age, status;
   
   /**
    *OFFLINE value for when status is offline.
    *ONLINE value for when status is online.
    */
   public static final int OFFLINE = 0, ONLINE = 1;
   
   /**
    *@param firstNameIn for firstName
    *@param lastNameIn for lastName
    */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not Specified";
      age = 0;
      status = OFFLINE;
   }
  
   /**
    *@param locationIn for location
    */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
   /**
    *@param ageIn for age
    *@return boolean
    */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    *@return int
    */
   public int getAge()
   {
      return age;
   }
   
   /**
    *@return String
    */
   public String getLocation()
   {
      return location;
   }
   
   /**
    *What is Proper Javadoc for this???
    */
   public void logOff()
   {
      status = OFFLINE;
   }
   
  /**
    *
    */
   public void logOn()
   {
      status = ONLINE;
   }
   
   /**
    *@return String
    */
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
         
      return output;
   }
}