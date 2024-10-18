package com.lorenzomiscoli.java_aes;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class App {

	public static void main(String args[])
			throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		String pwd = "SimpleTest";
		var aesUtil = new AESUtil();
		String encrypted = aesUtil.encrypt(pwd);
		System.out.println(encrypted);
		String decrypted = aesUtil.decrypt(encrypted);
		System.out.println(decrypted);
	}

}
