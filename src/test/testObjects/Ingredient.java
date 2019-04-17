package test.testObjects;

// Author  : Ganesh Harikrishnan
// Date    : 11/12/2018
// Purpose : Contain data stored in fields to act as an abstract superclass for all the ingredient types in a sandwich


public  class Ingredient {                                                                 // Class Ingredient is abstract as it should not be instantiated, only its subclasses
	
	// Fields for the ingredient class - this will be inherited by the subclasses Bread, Filling, and Topping
	
	
	private String     ingredientName;
	private double     cost;
	private boolean    vegetarian = false;                                                         // Dietary Requirement booleans set to false by default for safety reasons
	private boolean    vegan      = false;
	private boolean    nutFree    = false;
	private boolean    dairyFree  = false;
	private boolean    glutenFree = false;
	private boolean    spicy      = false;
	private String     vegetarianS = "(Vt)";                                                      // These Strings will display the properties of the sandwich in the UI
	private String     veganS      = "(Vn)";
	private String     nutFreeS    = "(Nf)";
	private String     dairyFreeS  = "(Df)";
	private String     glutenFreeS = "(Gf)";
	private String     spicyS      = "(Sp)";
	private String     properties  = " ";

	public Ingredient(String ingredientName, double cost) {                                        // Constructor method for Ingredient takes in two parameters name and cost, and assigns their values to the respective fields
		this.ingredientName = ingredientName;
		this.cost = cost;
		

	}
	
	// Get and Set Methods, since all the fields are private

	protected String getIngredientName() {
		return ingredientName;
	}

	protected void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	protected double getCost() {
		return cost;
	}

	protected void setCost(double cost) {
		this.cost = cost;
	}

	protected boolean isVegetarian() {
		return vegetarian;
	}

	protected void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
		properties  = properties + vegetarianS;                                                    // The properties string is a concatenation of all the dietary requirement properties strings                       
	}

	protected boolean isVegan() {
		return vegan;
	}

	protected void setVegan(boolean vegan) {
		this.vegan = vegan;
		properties  = properties + veganS;
	}

	protected boolean isNutFree() {
		return nutFree;
	}

	protected void setNutFree(boolean nutFree) {
		this.nutFree = nutFree;
		properties  = properties + nutFreeS;
	}

	protected boolean isDairyFree() {
		return dairyFree;
	}

	protected void setDairyFree(boolean dairyFree) {
		this.dairyFree = dairyFree;
		properties  = properties + dairyFreeS;
	}

	protected boolean isGlutenFree() {
		return glutenFree;
	}

	protected void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
		properties  = properties + glutenFreeS;
	}

	protected boolean isSpicy() {
		return spicy;
	}

	protected void setSpicy(boolean spicy) {
		this.spicy = spicy;
		properties  = properties + spicyS;
	}

	protected String getProperties() {
		return properties;
	}

	protected void setProperties(String properties) {
		this.properties = properties;
	}
	
	@Override
	public String toString(){
		return new String("Name: " + ingredientName + " Cost: " + cost + " Vegetarian: "+ vegetarian + " Vegan: " + vegan+ " NutFree: " + nutFree+ " GlutenFree: " + glutenFree+ " Spicy: " + spicy);
		//return getProperties();
	}
		
	

	

}
