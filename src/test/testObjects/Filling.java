package test.testObjects;

// Author  : Ganesh Harikrishnan
// Date    : 11/12/2018
// Purpose : To store data about the fillings, and be instantiated to create objects for the various types of fillings

public class Filling extends Ingredient {


	public Filling(String ingredientName, double cost) {                                           // Constructor method is inherited from Ingredient superclass
		super(ingredientName, cost);
		setNutFree(true);                                                                          // All of the fillings are nut free
		setDairyFree(true);                                                                        // All of the fillings are dairy free
		setGlutenFree(true);                                                                       // All of the fillings are gluten free
	
	}


}
