package Assignment3;

/** This class represents a derived subclass from the Item base-class. The 
  * purpose of this class is to be able to mark electronics items as fragile and 
  * adjust shipping rates appropriately for such fragile goods. This class will
  * also ensure no sales tax is calculated for electronics items being shipped
  * to certain states that do not have sales tax.
  *
  * @author J. Ngo and K. Cyr
  */
    
  /*####################*
 	*    Electronics		*
	*####################*
	*  -itemFragile		*	additional data field
	*	-itemTaxable		*	additional data field
	*####################*
	*	-setFragile			*	new method
	*	-setTaxable			*	new method
	*	-getFragile			*	new method
	*	-getTaxable			*	new method
	*	-calcShipping		*	overrides Item method
	*	-calcTax				*	overrides Item method
	*	-calcPrice			*	overrides Item method
	*	-printAttributes	*	overrides Item method
	*####################*/
	
public class Electronics extends Item
{
   // Data Fields
	
	   /** This is a boolean flag set to indicate that the electronics item is a 
		  * fragile good.
		  */
	   private boolean itemFragile;

	   /** This is a boolean flag set to indicate that the electronics item will 
		  * be shipped to a state that has sales tax.
		  */
	   private boolean itemTaxable;

   // Constants

	/** Current salex tax rate, in decimal format (e.g. 10% = .10)
	  */
	private static final float TAX_RATE = (float) .10;
	
	/** Current shipping rate.
	  */
	private static final int SHIPPING_RATE = 20;
	  
	/** Current premium shipping rate, in decimal format (e.g. 20% = .20)
	  */
	private static final float PREMIUM_SHIPPING = (float) .20;
	  
   // Constructors

	/** Construct an electronics item with the following initial values.
	  * @param name The name of the item.
	  * @param price The price assigned to one unit of this item.
	  * @param quantity How many of these items will be purchased.
	  * @param weight The weight of a single unit of this item.
	  * @param fragile True if the item is fragile.
	  * @param taxable True if the item is taxable.
	  */
	public Electronics(String name, 
					float price, 
					int quantity, 
					float weight, 
					boolean fragile,
					boolean taxable)
	{
		super(name, price, quantity, weight);
		itemFragile = fragile;
		itemTaxable = taxable;
	}
	
	// Modifier Methods
	
	/** Designates the electronics item as fragile or not.
	  * @param fragile True is the electronics item is fragile.
	  */
	public void setFragile(boolean fragile)
	{
		itemFragile = fragile;
	}

	/** Designates the electronics item as taxable or not.
	  * @param taxable True is the electronics item is taxable.
	  */
	public void setTaxable(boolean taxable)
	{
		itemTaxable = taxable;
	}

	// Access Methods
	
	/** Checks the current setting of the fragile flag.
	  * @return The current value of itemFragile.
	  */
	public boolean getFragile() { return itemFragile; }

	/** Checks the current setting of the taxable flag.
	  * @return The current value of itemTaxable.
	  */
	public boolean getTaxable() { return itemTaxable; }

	// Other Methods

	/** Determines the cost associated with shipping this item.
	  * @return The shipping cost. 
	  */
	float calcShipping()
	{
		float shipping_cost = 0;
		
		boolean fragile = getFragile();
		float weight = getWeight();
		int quantity = getQuantity();
		
		shipping_cost = ((SHIPPING_RATE * weight) * quantity);

		if(fragile)	// add premium shipping surcharge
		{
			shipping_cost = shipping_cost + (shipping_cost * PREMIUM_SHIPPING);
		}
		
		return shipping_cost;
	}
	
	/** Determines the cost associated with sales tax for this item.
	  * @return The amount of sales tax. 
	  */
	float calcTax()
	{
		float tax_cost = 0;
		
		boolean taxable = getTaxable();
		
		if(taxable) // calculate the tax
		{
			int quantity = getQuantity();
			float price = getPrice();

			tax_cost = ((quantity * price) * TAX_RATE);
		}
		return tax_cost;
	}
	
	/** Determines the entire cost of this item.
	  * @return The final price for this item.
	  */
	float calcPrice () 
	{
		float final_price = 0;
		
		float tax = calcTax();
		float shipping = calcShipping();
		int quantity = getQuantity();
		float price = getPrice();
		
		final_price = (quantity * price) + tax + shipping;

		return final_price;
	}

	/** 
	  */
	void printAttributes () 
	{
		//Print all applicable attributes of this class
	}
}