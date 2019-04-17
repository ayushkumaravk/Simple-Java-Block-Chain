package test.testObjects;

// Author  : Ganesh Harikrishnan
// Date    : 11/12/2018
// Purpose : To store data about the breads, and be instantiated to create objects for the various types of breads


public class Bread extends Ingredient {
	
	public Bread(String ingredientName, double cost) {                                             // Constructor method is inherited from Ingredient superclass
		super(ingredientName, cost);	                                                           

		setVegetarian(true);                                                                       // All of the breads are vegetarian
		setNutFree(true);                                                                          // All of the breads are nut free
                                                                                                   
	}
}



