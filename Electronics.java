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
	private static final float TAX_RATE = (float) .10;
	
	/** Current shipping rate.
	  */
	private static final int SHIPPING_RATE = 20;
	  
	/** Current premium shipping rate, in decimal format (e.g. 20% = .20)
	  */
	private static final float PREMIUM_SHIPPING = (float)  .20;
	  
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

	/** Determines the cost associated with shipping this item.
	  * @return The shipping cost. 
	  */
	float calcShipping()
	{
		float shipping_cost = 0;
		
		// Insert Calculation Here
		
		shipping_cost = ((SHIPPING_RATE * weight) * quantity);

		return shipping_cost;
	}
	
	/** Determines the cost associated with sales tax for this item.
	  * @return The amount of sales tax. 
	  */
	float calcTax()
	{
		float tax_cost = 0;
		
		// Insert Calculation Here
		
		return tax_cost;
	}
	
	/** Determines the entire cost of this item.
	  * @return The final price for this item.
	  */
	float calcPrice () 
	{
		float final_price = 0;
		
		// Insert Calculation Here
		
		final_price = (quantity * price) + tax + shipping;

		return final_price;
	}

	/** Determines the weight assigned to one of these items.
	  * @return The weight per each. 
	  */
	void printAttributes () 
	{
		//Print all applicable attributes of this class
	}
}