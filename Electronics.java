package Assignment3;

/** This class represents a derived subclass from the Item base-class. The 
  * purpose of this class is to be able to mark electronics items as fragile and 
  * adjust shipping rates appropriately for such fragile goods. This class will
  * also ensure no sales tax is calculated for electronics items being shipped
  * to certain states that do not have sales tax.
  *
  * @author J. Ngo and K. Cyr
  */
public class Electronics extends Item
{
   // Data Fields
	
   /** This is a boolean flag set to indicate that the electronics item is a 
	  * fragile good.
	  */
   private boolean itemFragile;
   
   // Constants

	/** Current salex tax rate, in decimal format (e.g. 10% = .10)
	  */
	private static final int TAX_RATE = .10;
	
	/** Current shipping rate.
	  */
	private static final int SHIPPING_RATE = 20;
	  
	/** Current premium shipping rate, in decimal format (e.g. 20% = .20)
	  */
	private static final int PREMIUM_SHIPPING = .20;
	  
   // Constructors

	/** Construct an electronics item with the following initial values.
	  * @param name The name of the item.
	  * @param price The price assigned to one unit of this item.
	  * @param quantity How many of these items will be purchased.
	  * @param weight The weight of a single unit of this item.
	  * @param fragile True if the item is fragile.
	  */
	public Electronics(String name, 
					float price, 
					int quantity, 
					float weight, 
					boolean fragile)
	{
		super(name, price, quantity, weight);
		itemFragile = fragile;
	}
	
	// Modifier Methods
	
	/** Designates the electronics item as fragile or not.
	  * @param fragile True is the electronics item is fragile.
	  */
	public void setFragile(boolean fragile)
	{
		itemFragile = fragile;
	}

	// Access Methods
	
	/** Checks the current setting of the fragile flag.
	  * @return The current value of itemFragile.
	  */
	public boolean getFragile() { return itemFragile; }

	// Other Methods
	
	/* These are all other methods that do not fit in the GET and SET suite of
	 * Modifier and Access methods defined above
	 */

	// Variables, constructors etc. here.
	
	//Implement calculate price/print methods as necessary

}