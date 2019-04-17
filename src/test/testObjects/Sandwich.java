package test.testObjects;

// Author  : Ganesh Harikrishnan
// Date    : 11/12/2018
// Purpose : To store data about the sandwiches, and be instantiated to create objects for various different Sandwiches, return their properties, and calculate their costs

public class Sandwich {
	
	// Fields for the Sandwich class - not inherited from a superclass
	private String sandwichName = "Custom Built Sandwich";
	private double sandwichCost;
	private double sandwichCostT;                                                                  // This field is to store the cost of the Sandwich with VAT applied
	private boolean  vegetarian = false;
	private boolean  vegan      = false;
	private boolean  nutFree    = false;
	private boolean  dairyFree  = false;
	private boolean  glutenFree = false;
	private boolean  spicy      = false;
	private int fN;                                                                                // This field stores the number of fillings the Sandwich contains (1-3)
	private int tN;                                                                                // This field stores the number of toppings the Sandwich contains (1-2)
	private Bread bread;                                                                           // Objects are also stored as fields as they contain important properties for the Sandwich
	private Filling filling1;
	private Filling filling2;
	private Filling filling3;
	private Topping topping1;
	private Topping topping2;
	private String  properties = "";

	
	// Constructors to create Sandwich Objects covering all possible cases of filling and topping numbers
	
	public Sandwich(Bread bread1, Filling filling1, Topping topping1) {                            // Each constructor takes in objects for the bread, fillings and toppings
		                                                                             
		this.bread = bread1;                                                                       // Field objects are assigned to the value of the parameter objects so that these objects may be accessed outside of the constructor
		this.filling1 = filling1;
		this.topping1 = topping1;
		this.sandwichCost  = bread1.getCost() + filling1.getCost() + topping1.getCost();           // The cost of the Sandwich is calculated by summing the cost of each ingredient
		this.sandwichCostT = TaxCalculator.tax(sandwichCost);                                      // A method from the Tax Calculator is used to apple VAT to the cost, and this value is then stored
		fN = 1;                                                                                    // The number of fillings is assigned
		tN = 1;                                                                                    // The number of toppings is assigned
		
		if (bread1.isVegetarian() && filling1.isVegetarian() && topping1.isVegetarian()){          // Sets the dietary requirement properties of the Sandwich by checking if each ingredient satisfies that requirement
			vegetarian = true;
			properties = properties + "(Vt)";
		}
		
		if (bread1.isVegan() && filling1.isVegan() && topping1.isVegan()){
			vegan = true;
			properties = properties + "(Vn)";
		}
		
		if (bread1.isNutFree() && filling1.isNutFree() && topping1.isNutFree()){
			nutFree = true;
			properties = properties + "(Nf)";
		}
		
		if (bread1.isDairyFree() && filling1.isDairyFree() && topping1.isDairyFree()){
			dairyFree = true;
			properties = properties + "(Df)";
		}
		
		if (bread1.isGlutenFree() && filling1.isGlutenFree() && topping1.isGlutenFree()){
			glutenFree = true;
			properties = properties + "(Gf)";
		}
		
		if (bread1.isSpicy() || filling1.isSpicy() || topping1.isSpicy()){                         // Only one of the ingredients need to be spicy for the Sandwich to be spicy, so the OR operator is used here instead
			spicy = true;
			properties = properties + "(Sp)";
		}
	}
	
    public Sandwich(Bread bread1, Filling filling1, Topping topping1, Topping topping2) {          // The constructor is repeated and altered so that the Sandwich can be built with a variable number of fillings and toppings
		
		this.bread = bread1;
		this.filling1 = filling1;
		this.topping1 = topping1;
		this.topping2 = topping2;
		this.sandwichCost  = bread1.getCost() + filling1.getCost() + topping1.getCost() + topping2.getCost();
		this.sandwichCostT = TaxCalculator.tax(sandwichCost);
		fN = 1;
		tN = 2;
		
		if (bread1.isVegetarian() && filling1.isVegetarian() && topping1.isVegetarian() && topping2.isVegetarian()){
			vegetarian = true;
			properties = properties + "(Vt)";
		}
		
		if (bread1.isVegan() && filling1.isVegan() && topping1.isVegan() && topping2.isVegan()){
			vegan = true;
			properties = properties + "(Vn)";
		}
		
		if (bread1.isNutFree() && filling1.isNutFree() && topping1.isNutFree() && topping2.isNutFree()){
			nutFree = true;
			properties = properties + "(Nf)";
		}
		
		if (bread1.isDairyFree() && filling1.isDairyFree() && topping1.isDairyFree() && topping2.isDairyFree()){
			dairyFree = true;
			properties = properties + "(Df)";
		}
		
		if (bread1.isGlutenFree() && filling1.isGlutenFree() && topping1.isGlutenFree() && topping2.isGlutenFree()){
			glutenFree = true;
			properties = properties + "(Gf)";
		}
		
		if (bread1.isSpicy() || filling1.isSpicy() || topping1.isSpicy() || topping2.isSpicy()){
			spicy = true;
			properties = properties + "(Sp)";
		}
	}
	
    public Sandwich(Bread bread1, Filling filling1, Filling filling2, Topping topping1) {
		
		this.bread = bread1;
		this.filling1 = filling1;
		this.filling2 = filling2;
		this.topping1 = topping1;		
		this.sandwichCost  = bread1.getCost() + filling1.getCost() + filling2.getCost() + topping1.getCost();
		this.sandwichCostT = TaxCalculator.tax(sandwichCost);
		fN = 2;
		tN = 1;
		
		if (bread1.isVegetarian() && filling1.isVegetarian() && filling2.isVegetarian() && topping1.isVegetarian()){
			vegetarian = true;
			properties = properties + "(Vt)";
		}
		
		if (bread1.isVegan() && filling1.isVegan() && filling2.isVegan() && topping1.isVegan()){
			vegan = true;
			properties = properties + "(Vn)";
		}
		
		if (bread1.isNutFree() && filling1.isNutFree() && filling2.isNutFree() && topping1.isNutFree()){
			nutFree = true;
			properties = properties + "(Nf)";
		}
		
		if (bread1.isDairyFree() && filling1.isDairyFree() && filling2.isDairyFree() && topping1.isDairyFree()){
			dairyFree = true;
			properties = properties + "(Df)";
		}
		
		if (bread1.isGlutenFree() && filling1.isGlutenFree() && filling2.isGlutenFree() && topping1.isGlutenFree()){
			glutenFree = true;
			properties = properties + "(Gf)";
		}
		
		if (bread1.isSpicy() || filling1.isSpicy() || filling2.isSpicy() || topping1.isSpicy()){
			spicy = true;
			properties = properties + "(Sp)";
		}
	}
    public Sandwich(Bread bread1, Filling filling1, Filling filling2, Topping topping1, Topping topping2) {
		
		this.bread = bread1;
		this.filling1 = filling1;
		this.filling2 = filling2;
		this.topping1 = topping1;
		this.topping2 = topping2;
		this.sandwichCost  = bread1.getCost() + filling1.getCost() + filling2.getCost() + topping1.getCost() + topping2.getCost();
		this.sandwichCostT = TaxCalculator.tax(sandwichCost);
		fN = 2;
		tN = 2;
		
		if (bread1.isVegetarian() && filling1.isVegetarian() && filling2.isVegetarian() && topping1.isVegetarian() && topping2.isVegetarian()){
			vegetarian = true;
			properties = properties + "(Vt)";
		}
		
		if (bread1.isVegan() && filling1.isVegan() && filling2.isVegan() && topping1.isVegan() && topping2.isVegan()){
			vegan = true;
			properties = properties + "(Vn)";
		}
		
		if (bread1.isNutFree() && filling1.isNutFree() && filling2.isNutFree() && topping1.isNutFree() && topping2.isNutFree()){
			nutFree = true;
			properties = properties + "(Nf)";
		}
		
		if (bread1.isDairyFree() && filling1.isDairyFree() && filling2.isDairyFree() && topping1.isDairyFree() && topping2.isDairyFree()){
			dairyFree = true;
			properties = properties + "(Df)";
		}
		
		if (bread1.isGlutenFree() && filling1.isGlutenFree() && filling2.isGlutenFree() && topping1.isGlutenFree() && topping2.isGlutenFree()){
			glutenFree = true;
			properties = properties + "(Gf)";
		}
		
		if (bread1.isSpicy() || filling1.isSpicy() || filling2.isSpicy() || topping1.isSpicy() || topping2.isSpicy()){
			spicy = true;
			properties = properties + "(Sp)";
		}
	}
    
    public Sandwich(Bread bread1, Filling filling1, Filling filling2, Filling filling3, Topping topping1) {
		
		this.bread = bread1;
		this.filling1 = filling1;
		this.filling2 = filling2;
		this.filling3 = filling3;
		this.topping1 = topping1;
		this.sandwichCost  = bread1.getCost() + filling1.getCost() + filling2.getCost() + filling3.getCost() +topping1.getCost();
		this.sandwichCostT = TaxCalculator.tax(sandwichCost);
		fN = 3;
		tN = 1;
		
		if (bread1.isVegetarian() && filling1.isVegetarian() && filling2.isVegetarian() && filling3.isVegetarian() && topping1.isVegetarian()){
			vegetarian = true;
			properties = properties + "(Vt)";
		}
		
		if (bread1.isVegan() && filling1.isVegan() && filling2.isVegan() && filling3.isVegan() && topping1.isVegan()){
			vegan = true;
			properties = properties + "(Vn)";
		}
		
		if (bread1.isNutFree() && filling1.isNutFree() && filling2.isNutFree() && filling3.isNutFree() && topping1.isNutFree()){
			nutFree = true;
			properties = properties + "(Nf)";
		}
		
		if (bread1.isDairyFree() && filling1.isDairyFree() && filling2.isDairyFree() && filling3.isDairyFree() && topping1.isDairyFree()){
			dairyFree = true;
			properties = properties + "(Df)";
		}
		
		if (bread1.isGlutenFree() && filling1.isGlutenFree() && filling2.isGlutenFree()  && filling3.isGlutenFree() && topping1.isGlutenFree()){
			glutenFree = true;
			properties = properties + "(Gf)";
		}
		
		if (bread1.isSpicy() || filling1.isSpicy() || filling2.isSpicy() || filling3.isSpicy() || topping1.isSpicy()){
			spicy = true;
			properties = properties + "(Sp)";
		}
	}
    
    public Sandwich(Bread bread1, Filling filling1, Filling filling2, Filling filling3, Topping topping1, Topping topping2) {
		
		this.bread = bread1;
		this.filling1 = filling1;
		this.filling2 = filling2;
		this.filling3 = filling3;
		this.topping1 = topping1;
		this.topping2 = topping2;
		this.sandwichCost  = bread1.getCost() + filling1.getCost() + filling2.getCost() + filling3.getCost() + topping1.getCost() + topping2.getCost();
		this.sandwichCostT = TaxCalculator.tax(sandwichCost);
		fN = 3;
		tN = 2;
		
		if (bread1.isVegetarian() && filling1.isVegetarian() && filling2.isVegetarian() && filling3.isVegetarian() && topping1.isVegetarian() && topping2.isVegetarian()){
			vegetarian = true;
			properties = properties + "(Vt)";
		}
		
		if (bread1.isVegan() && filling1.isVegan() && filling2.isVegan() && filling3.isVegan() && topping1.isVegan() && topping2.isVegan()){
			vegan = true;
			properties = properties + "(Vn)";
		}
		
		if (bread1.isNutFree() && filling1.isNutFree() && filling2.isNutFree() && filling3.isNutFree() && topping1.isNutFree() && topping2.isNutFree()){
			nutFree = true;
			properties = properties + "(Nf)";
		}
		
		if (bread1.isDairyFree() && filling1.isDairyFree() && filling2.isDairyFree() && filling3.isDairyFree() && topping1.isDairyFree() && topping2.isDairyFree()){
			dairyFree = true;
			properties = properties + "(Df)";
		}
		
		if (bread1.isGlutenFree() && filling1.isGlutenFree() && filling2.isGlutenFree()  && filling3.isGlutenFree() && topping1.isGlutenFree() && topping2.isGlutenFree()){
			glutenFree = true;
			properties = properties + "(Gf)";
		}
		
		if (bread1.isSpicy() || filling1.isSpicy() || filling2.isSpicy() || filling3.isSpicy() || topping1.isSpicy() || topping2.isSpicy()){
			spicy = true;
			properties = properties + "(Sp)";
		}
	}
    
    // Get/Set methods to return (and modify) the values of the fields, including the objects
    protected String getSandwichName() {
		return sandwichName;
	}
	protected void setSandwichName(String sandwichName) {
		this.sandwichName = sandwichName;
	}
	protected double getSandwichCost() {
		return sandwichCost;
	}
	protected void setSandwichCost(double sandwichCost) {
		this.sandwichCost = sandwichCost;
	}	
	protected double getSandwichCostT() {
		return sandwichCostT;
	}
	protected void setSandwichCostT(double sandwichCostT) {
		this.sandwichCostT = sandwichCostT;
	}
	
	
	protected boolean isVegetarian() {
		return vegetarian;
	}
	protected void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	protected boolean isVegan() {
		return vegan;
	}
	protected void setVegan(boolean vegan) {
		this.vegan = vegan;
	}
	protected boolean isNutFree() {
		return nutFree;
	}
	protected void setNutFree(boolean nutFree) {
		this.nutFree = nutFree;
	}
	protected boolean isDairyFree() {
		return dairyFree;
	}
	protected void setDairyFree(boolean dairyFree) {
		this.dairyFree = dairyFree;
	}
	protected boolean isGlutenFree() {
		return glutenFree;
	}
	protected void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}
	protected boolean isSpicy() {
		return spicy;
	}
	protected void setSpicy(boolean spicy) {
		this.spicy = spicy;
	}
	
	
	protected int getfN() {
		return fN;
	}
	protected void setfN(int fN) {
		this.fN = fN;
	}
	protected int gettN() {
		return tN;
	}
	protected void settN(int tN) {
		this.tN = tN;
	}
	
	
	protected Bread getBread() {
		return bread;
	}
	protected void setBread(Bread bread) {
		this.bread = bread;
	}
	protected Filling getFilling1() {
		return filling1;
	}
	protected void setFilling1(Filling filling1) {
		this.filling1 = filling1;
	}
	protected Filling getFilling2() {
		return filling2;
	}
	protected void setFilling2(Filling filling2) {
		this.filling2 = filling2;
	}
	protected Filling getFilling3() {
		return filling3;
	}
	protected void setFilling3(Filling filling3) {
		this.filling3 = filling3;
	}
	protected Topping getTopping1() {
		return topping1;
	}
	protected void setTopping1(Topping topping1) {
		this.topping1 = topping1;
	}
	protected Topping getTopping2() {
		return topping2;
	}
	protected void setTopping2(Topping topping2) {
		this.topping2 = topping2;
	}

	protected String getProperties() {
		return properties;
	}

	protected void setProperties(String properties) {
		this.properties = properties;
	}
	
	
}
	
	

