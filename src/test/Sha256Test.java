package test;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha256Test {

	public static void main(String[] args) {
		String username = "user1";
		String password = "password3";
		String salt = "uqyrncc";
		
		String hashedPassword = DigestUtils.sha256Hex(salt + password);
				
		System.out.println(hashedPassword);
	}

}
