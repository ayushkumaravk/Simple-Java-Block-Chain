package test;

import java.util.Arrays;

import simpleBlockChain.Block;
import simpleBlockChain.blockChain;
import test.testObjects.Ingredient;

public class blockChainTest {

	public static void main(String[] args) {
		blockChain test = new blockChain();
		
		//int testInt = (int) (Math.random() * Integer.MAX_VALUE - 1);
		
		
		
		test.addBlock(new Block(1, new Ingredient("bread", 1.00), ""));
		//test.addBlock(new Block(2, new Ingredient("jam", 3.00), ""));
		//test.addBlock(new Block(3, new Ingredient("butter", 25.80), ""));
		//test.addBlock(new Block(4, new Ingredient("cheese", 231.32), ""));
		
		test.print();

	}

}
