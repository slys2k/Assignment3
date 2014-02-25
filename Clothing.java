package Assignment3;

/** This class represents a derived subclass from the Item base-class. The 
  * purpose of this class is to be able to designate items as clothing. Clothing
  * items must have be charged the usual sales tax. Clothing items are not 
  * eligible for premium shipping.
  *
  * @author J. Ngo and K. Cyr
  */
public class Clothing extends Item
{
   // Data Fields
	
   /** There are no data fields specific to clothing items yet.
	  */
	
   // Constants
	
	/** There are no constants yet defined for this class.
	  */
	
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
					float weight, 
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
	
	/* These are all other methods that do not fit in the GET and SET suite of
	 * Modifier and Access methods defined above
	 */
	
	float calculatePrice () 
	{
		float final_price = 0;
		// Insert price calculation here
		return final_price;
	}
	
	void printAttributes () 
	{
		//Print all applicable attributes of this sub-class
	}
	

}