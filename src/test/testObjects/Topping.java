package test.testObjects;

// Author  : Ganesh Harikrishnan
// Date    : 11/12/2018
// Purpose : To store data about the toppings, and be instantiated to create objects for the various types of toppings

public class Topping extends Ingredient {


	public Topping(String ingredientName, double cost) {                                           // Constructor Methods is inherited from the ingredient superclass
		super(ingredientName, cost);
		setVegetarian(true);                                                                       // All of the toppings are vegetarian
		setNutFree(true);                                                                          // All of the toppings are nut free
		setGlutenFree(true);                                                                       // All of the toppings are gluten free
		
		
	}
	

	

}
