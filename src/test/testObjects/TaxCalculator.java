package test.testObjects;


public abstract class TaxCalculator {
	
	private static double taxRate = 1.2;               // This field allows VAT to be applied to a cost

	public TaxCalculator() {
		
	}
	
	protected static double tax(double cost){          // This method takes in the Cost, and returns it with VAT applied
		return (cost * taxRate);                       // The value of the cost is altered, so that VAT is applied
	}  

}
