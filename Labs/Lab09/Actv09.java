public class Actv09
{
   public static void main(String[] args)
   {
      InventoryItem.setTaxRate(0.05);
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.99);
      ElectronicsItem item2 = new ElectronicsItem("Cordless Phone", 39.99, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
   }
}