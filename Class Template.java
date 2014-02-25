/* Default Class Design 
 * All multi-line comments are meant to be removed comments are meant to be 
 * removed.
 * All single line comments and javadoc formatted comments are meant to remain.
 */
package classTemplate;

/** This class represents a ____________ 
  * The purpose of this class is to ____________
  *
  * @author J. Doe
  */
public class newClass
{
   // Data Fields
	
   /** This is what the first data field is. 
	  */
   private String firstDataField;
   
   /** This is what the second data field is. 
	  */
   private int secondDataField;
   
   // Constants
	
   /** description of first constant 
	  */
   private static final int FIRST_CONSTANT = 0;
   /** description of second constant 
	  */
   private static final int SECOND_CONSTANT = 0;
   
   // Constructors
	
   /* Defining any constructors removes the default zero-parameter constructor,
    * so if a zero-parameter constructor is still desired it must be defined 
    * explicitly */
   /** Construct a newClass with these two given values
	  * @param firstDataField Description of the first data field
	  * @param secondDataField Description of the second data field
	  */
	public newClass(String firstParam, int secondParam)
	{
		firstDataField = firstParam;
		secondDataField = secondParam;
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