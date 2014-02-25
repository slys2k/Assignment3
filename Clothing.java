package Assignment3;

/** This class represents a derived subclass from the Item base-class. The 
  * purpose of this class is to be able to designate items as clothing. Clothing
  * items must have be charged the usual sales tax. Clothing items are not 
  * eligible for premium shipping.
  *
  * @author J. Ngo and K. Cyr
  */
  
  /*####################*
 	*    Clothing			*
	*####################*
	* 							*	
	*####################*
	*							*
	*####################*/
	
public class Clothing extends Item
{
   // Data Fields
	
   /** There are no data fields specific to clothing items yet.
	  */
	
   // Constants

	/** Current salex tax rate, in decimal format (e.g. 10% = .10)
	  */
	private static final float TAX_RATE = (float) .10;
	
	/** Current shipping rate.
	  */
	private static final int SHIPPING_RATE = 20;
	  
   // Constructors

	/** Construct a clothing item with the following initial values.
	  * @param name The name of the item.
	  * @param price The price assigned to one unit of this item.
	  * @param quantity How many of these items will be purchased.
	  * @param weight The weight of a single unit of this item.
	  */
	public Clothing(String name, 
					float price, 
					int quantity, 
					float weight) 
	{
		super(name, price, quantity, weight);
	}
	
	// Modifier Methods
	
	/** There are no specific modifier methods for this class yet.
	  */

	// Access Methods
	
	/** There are no specific access methods for this class yet.
	  */

	// Other Methods

	/** Determines the cost associated with shipping this item.
	  * @return The shipping cost. 
	  */
	float calcShipping()
	{
		float shipping_cost = 0;

		float weight = getWeight();
		int quantity = getQuantity();

		shipping_cost = ((SHIPPING_RATE * weight) * quantity);

		return shipping_cost;
	}
	
	/** Determines the cost associated with sales tax for this item.
	  * @return The amount of sales tax. 
	  */
	float calcTax()
	{
		float tax_cost = 0;

		int quantity = getQuantity();
		float price = getPrice();

		tax_cost = ((quantity * price) * TAX_RATE);

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