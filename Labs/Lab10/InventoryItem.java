public class InventoryItem
{
   protected String name = "";
   protected double price = 0.0;
   private static double taxRate = 0.0;
   
   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double calculateCost()
   {
      return price * (1 + taxRate);
   }
   
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
   
   public String toString()
   {
      return name + ": $" + calculateCost();
   }
}