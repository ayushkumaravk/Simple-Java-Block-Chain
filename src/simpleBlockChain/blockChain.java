package simpleBlockChain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class blockChain {

	public static List<Block> chain = new ArrayList<Block>();
	private int difficulty = 2;
	
	public blockChain(){
		chain.add(genesisBlock());
		
	}
	
	private Block genesisBlock(){
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    String formatDateTime = now.format(formatter);
		return new Block(0, new String("New Block Created on " + formatDateTime), new String("0"));
	}
	
	public Block getLatestBlock(){
		return chain.get(chain.size() - 1);
	}
	
	public void addBlock(Block newBlock){
		newBlock.setPreviousHash(this.getLatestBlock().getHashCode());
		newBlock.setHashCode();
		newBlock.mineBlock(difficulty);
		chain.add(newBlock);
	}
	
	public boolean isValid(){
		for(int i = 1; i < chain.size(); i++){
			Block currentBlock  = chain.get(i);
			Block previousBlock = chain.get(i-1);
			
			if (currentBlock.getPreviousHash() != previousBlock.getHashCode()){
				return false;
			}
		}
		return true;
	}
	
	@Override 
	public String toString(){
			return new String(Arrays.toString(chain.toArray()));
    }
	
	public static void print(){
		for (int i = 0; i < chain.size(); i++){
			System.out.println(chain.get(i).index + " " + chain.get(i).getHashCode() + " [ " + chain.get(i).getData() + " ]");
		}
	}
}
