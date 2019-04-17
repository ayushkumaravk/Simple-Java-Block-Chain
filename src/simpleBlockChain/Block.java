package simpleBlockChain;

import java.time.LocalDateTime;
import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;

public class Block {
	
	public final int index;
	public final LocalDateTime timestamp;
	private final Object data;
	private String hashCode;
	private String previousHash;
	private int randomInt = 0;
	
	
	public Block(int index, Object data, String previousHash){
		this.index = index;
		this.timestamp = LocalDateTime.now();
		this.data = data;
		this.hashCode = calculateHash();
		this.previousHash = previousHash;
		//this.randomInt = (int) (Math.random() * Integer.MAX_VALUE - 1);
	}
	
	public void mineBlock(int difficulty){
		while (!this.hashCode.substring(0, difficulty).equals(new String ("0"))){
			hashCode = calculateHash();
			this.randomInt = this.randomInt + 1;
		}
	}
	
	public String calculateHash(){
		//String hashCode = Integer.toString( hashCode());
		String rawCode = Integer.toString(index) + data.toString() + previousHash + Integer.toString(randomInt);
		String hashCodeSHA = DigestUtils.sha256Hex(rawCode);
		return hashCodeSHA;
	}
	
	public void setPreviousHash(String inputHash){
		this.previousHash = inputHash;
	}
	
	public String getHashCode(){
		return hashCode;
	}
	
	public void setHashCode(){
		this.hashCode = calculateHash();
	}
	
	public String getPreviousHash(){
		return previousHash;
	}
	
	public Object getData(){
		return data;
	}
	
	@Override
	public String toString(){
		return data.toString();
	}
	

	
}
