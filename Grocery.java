package Assignment3;

/** This class represents a derived subclass from the Item base-class. The 
  * purpose of this class is to be able to mark items as perishable and adjust
  * shipping and tax rates appropriately for such perishable goods.
  * @author J. Ngo and K. Cyr
  */
public class Grocery extends Item
{
   // Data Fields
	
   /** This is a boolean flag set to indicate that the grocery item is a 
	  * perishable good.
	  */
   private boolean perishableGrocery;
   
   // Constants
	
	/** There are no constants yet defined for this class.
	  */
	
   // Constructors
	/** Construct an Item with the following initial values.
	  * @param name The name of the item.
	  * @param price The price assigned to one unit of this item.
	  * @param quantity How many of these items will be purchased.
	  * @param weight The weight of a single unit of this item.
	  * @param perishable True if the item is perishable.
	  */
	public Item(String name, 
					float price, 
					int quantity, 
					float weight, 
					boolean perishable)
	{
		super(name, price, quantity, weight);
		perishableGrocery = perishable;
	}
	
  /** Construct a newClass with this value specified
	  * @param firstDataField Description of the first data field
	  */
	public newClass(String firstParam)
	{
		firstDataField = firstParam;
	}
	
   /** Construct a newClass with this value specified
	  * @param firstDataField Description of the first data field
	  */
	public newClass(int secondParam)
	{
		secondDataField = secondParam;
	}
	
	/** Construct a newClass with default values
	  */
	public newClass()
	{
		firstDataField = null;
		secondDataField = 0;
	}

	// Modifier Methods
	
	/** Sets the firstDataField field.
	  * @param firstParam 
	  */
	public void setFirstDataField(String firstParam)
	{
		firstDataField = firstParam;
	}

	/** Sets the secondDataField field.
	  * @param secondParam 
	  */
	public void setSecondDataField(int secondParam)
	{
		secondDataField = secondParam;
	}
	
	// Access Methods
	
	/** Gets the value of firstDataField
	  * @return the value of firstDataField as a String
	  */
	public Sting getFirstDataField() { return firstDataField; }
	
	/** Gets the value of secondDataField
	  * @return the value of secondDataField as an int
	  */
	public int getSecondDataField() { return secondDataField; }
	
	// Other Methods
	
	/* These are all other methods that do not fit in the GET and SET suite of
	 * Modifier and Access methods defined above
	 */

	//variables, constructor here
	
	//override calculatePrice() if necessary; Implement print methods as necessary	
	// Only re-implement stuff you cannot get from the superclass (Item)
	
}