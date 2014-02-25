package Assignment3;

/** This class represents a derived subclass from the Item base-class. The 
  * purpose of this class is to be able to mark grocery items as perishable and 
  * adjust shipping rates appropriately for such perishable goods. This class
  * will also ensure no sales tax is calculated for grocery items.
  *
  * @author J. Ngo and K. Cyr
  */
public class Grocery extends Item
{
   // Data Fields
	
   /** This is a boolean flag set to indicate that the grocery item is a 
	  * perishable good.
	  */
   private boolean itemPerishable;
   
   // Constants

	/** Current salex tax rate, in decimal format (e.g. 10% = .10)
	  */
	private static final float TAX_RATE = .10;
	
	/** Current shipping rate.
	  */
	private static final int SHIPPING_RATE = 20;
	  
	/** Current premium shipping rate, in decimal format (e.g. 20% = .20)
	  */
	private static final float PREMIUM_SHIPPING = .20;
	  
   // Constructors

	/** Construct an grocery item with the following initial values.
	  * @param name The name of the item.
	  * @param price The price assigned to one unit of this item.
	  * @param quantity How many of these items will be purchased.
	  * @param weight The weight of a single unit of this item.
	  * @param perishable True if the item is perishable.
	  */
	public Grocery(String name, 
					float price, 
					int quantity, 
					float weight, 
					boolean perishable)
	{
		super(name, price, quantity, weight);
		itemPerishable = perishable;
	}
	
	// Modifier Methods
	
	/** Designates the grocery item as perishable or not.
	  * @param perishable True is the grocery item is perishable.
	  */
	public void setItemPerishable(boolean perishable)
	{
		itemPerishable = perishable;
	}

	// Access Methods
	
	/** Checks the current setting of the perishable flag.
	  * @return The current value of the perishableGrocery
	  */
	public boolean getItemPerishable() { return itemPerishable; }

	// Other Methods
	
	/* These are all other methods that do not fit in the GET and SET suite of
	 * Modifier and Access methods defined above
	 */

	 //override calculatePrice() if necessary; Implement print methods as necessary	
	// Only re-implement stuff you cannot get from the superclass (Item)
	
}