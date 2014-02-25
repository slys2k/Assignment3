package Assignment3;

/** This class represents a general item object. The purpose is to have a 
  * general base-class for all purchasable items. The name, price, quantity, and
  * weight are all attributes of an item object, which will have available the 
  * get and set methods.
  * 
  * @author K. Cyr, J. Ngo
  */
public class Item 
{   
	// Data Fields (instance variables)
	
	/** A string that identifies the item being purchased. 
	  */
	protected String itemName;
	
	/** A float variable to represent the price of one unit of the item to be 
	  * purchased. 
	  */
	protected float itemPrice; 
	
	/** This integer is how many of this item that will be purchased. 
	  */
	protected int itemQuantity;

	/** The weight of a single unit of this particular item.
	  */
	protected float itemWeight;
	
	// Constants
	
	/** Current salex tax rate, in decimal format (e.g. 10% = .10)
	  */
	private static final float TAX_RATE = (float) .10;
	
	/** Current shipping rate.
	  */
	private static final int SHIPPING_RATE = 20;
	  
	// Constructors

	/** Construct an Item with the following initial values.
	  * @param name The name of the item.
	  * @param price The price assigned to one unit of this item.
	  * @param quantity How many of these items will be purchased.
	  * @param weight The weight of a single unit of this item.
	  */
	public Item(String name, 
					float price, 
					int quantity, 
					float weight)
	{
		itemName = name;
		itemPrice = price;
		itemQuantity = quantity;
		itemWeight = weight;
	}
	
	// Modifier Methods
	
	/** Assign a new name to the item in the cart.
	  * @param newName The desired name.
	  */
	public void setName(String newName) {	itemName = newName; }
	
	/** Change the price of one of these items to a desired value.
	  * @param newPrice The desired price for this item.
	  */
	public void setPrice(float newPrice) { itemPrice = newPrice; }
	
	/** Change the quantity of an item in the cart.
	  * @param newQuantity The new number of this item wished to be purchased.
	  */
	public void setQuantity(int newQuantity) { itemQuantity = newQuantity; }

	/** Assigns a new weight to the item in the cart
	  * @param newWeight The desired weight of the item in the cart
	  */
	public void setWeight(float newWeight) { itemWeight = newWeight; }

	// Access Methods

	/** Determines the name of the current item.
	  * @return The the name of the object. 
	  */
	public String getName() { return itemName; }
	
	/** Gets the price associated with one of these items.
	  * @return The price per each.
	  */
	public float getPrice() { return itemPrice; }
	
	/** Gets the quantity of this item currently in the cart.
	  * @return The item quantity.
	  */
	public int getQuantity() { return itemQuantity; }

	/** Determines the weight assigned to one of these items.
	  * @return The weight per each. 
	  */
	public float getWeight() { return itemWeight; }
		
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

	/** Determines the weight assigned to one of these items.
	  * @return The weight per each. 
	  */
	void printAttributes () 
	{
		//Print all applicable attributes of this class
	}
}