package Assignment3;

/** This class represents a derived subclass from the Item base-class. The 
  * purpose of this class is to be able to mark grocery items as perishable and 
  * adjust shipping rates appropriately for such perishable goods. This class
  * will also ensure no sales tax is calculated for grocery items.
  *
  * @author J. Ngo and K. Cyr
  */
  
  /*####################*
 	*    Grocery			*
	*####################*
	*  -itemPerishable	*	additional data field
	*####################*
	*	-setPerishable		*	new method
	*	-getPerishable		*	new method
	*	-calcShipping		*	overrides Item method
	*	-calcTax				*	overrides Item method
	*	-calcPrice			*	overrides Item method
	*	-printAttributes	*	overrides Item method
	*####################*/
	
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
	private static final float TAX_RATE = (float) .10;
	
	/** Current shipping rate.
	  */
	private static final int SHIPPING_RATE = 20;
	  
	/** Current premium shipping rate, in decimal format (e.g. 20% = .20)
	  */
	private static final float PREMIUM_SHIPPING = (float) .20;
	  
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
	public void setPerishable(boolean perishable)
	{
		itemPerishable = perishable;
	}

	// Access Methods
	
	/** Checks the current setting of the perishable flag.
	  * @return The current value of the perishableGrocery
	  */
	public boolean getPerishable() { return itemPerishable; }

	// Other Methods

	/** Determines the cost associated with shipping this item.
	  * @return The shipping cost. 
	  */
	float calcShipping()
	{
		float shipping_cost = 0;
		
		boolean perishable = getPerishable();
		float weight = getWeight();
		int quantity = getQuantity();
		
		shipping_cost = ((SHIPPING_RATE * weight) * quantity);

		if(perishable)	// add premium shipping surcharge
		{
			shipping_cost = shipping_cost + (shipping_cost * PREMIUM_SHIPPING);
		}
		
		return shipping_cost;
	}
	
	/** Determines the cost associated with sales tax for this item.
	  * @return The amount of sales tax. 
	  */
	float calcTax() { return 0; }	// groceries currently incur no sales tax
	
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
		String name = getName();
		int quantity = getQuantity();
		float price = getPrice();
		float weight = getWeight();

		float total_cost = calcPrice();
		float tax = calcTax();
		float shipping = calcShipping();
		
		boolean perishable = getPerishable();
		String perishability = "not perishable";
		if(perishable) { perishability = "perishable"; }
		
		System.out.println("Grocery\n" + "Name: " + name + " Qty: "
								+ quantity + " Unit Price: " + price + " Weight: "
								+ weight + "\n" + "Grocery items are not taxed.\n"
								+ "This item is " + perishability 
								+ ", so the shipping will cost $" + shipping 
								+ ".\nThe total cost for this item is $" + total_cost 
								+ ".\n\n");		
	}
}