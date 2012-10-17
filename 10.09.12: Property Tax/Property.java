/**
 * Class that represents a property's value. It contains methods to calculate
 * and retrieve the property's assessment value and property tax.
 * 
 * @author Zachary Latta
 *
 */
public class Property {
	private double PROPERTY_TAX_RATE = 0.0064;
	private double ASSESSMENT_VALUE_RATE = 0.6;
	
	private double actualValue;
	private double assessmentValue;
	private double propertyTax;

	/**
	 * Class constructor that sets the actualValue and calculates
	 * the assessmentValue and propertyTax
	 * 
	 * @param value	The value of the property.
	 */
	public Property(double value)
	{
		setActualValue(value);
		calculateAssessmentValue();
		calculatePropertyTax();
	}
	
	/* Mutators */
	
	/**
	 * Sets actualValue to the value, the argument.
	 * 
	 * @param value The value of the property
	 */
	private void setActualValue(double value)
	{
		actualValue = value;
	}
	
	/**
	 * Sets assessmentValue to actualValue * ASSESSMENT_VALUE_RATE
	 */
	private void calculateAssessmentValue()
	{
		assessmentValue = actualValue * ASSESSMENT_VALUE_RATE;
	}
	
	/**
	 * Sets propertyTax to assessmentValue * PROPERTY_TAX_RATE
	 */
	private void calculatePropertyTax()
	{
		propertyTax = assessmentValue * PROPERTY_TAX_RATE;
	}
	
	
	/* Accessors */
	
	/**
	 * Returns the actual value of the property.
	 * 
	 * @return actualValue
	 */
	public double getActualValue()
	{
		return actualValue;
	}
	
	/**
	 * Returns the property's assessment value.
	 * 
	 * @return assessmentValue
	 */
	public double getAssessmentValue()
	{
		return assessmentValue;
	}
	
	
	/**
	 * Returns the property tax on the property
	 * 
	 * @return propertyTax
	 */
	public double getPropertyTax()
	{
		return propertyTax;
	}
}
