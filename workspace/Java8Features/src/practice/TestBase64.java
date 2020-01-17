package practice;

import java.util.Base64;

public class TestBase64 {

	public static void main(String[] args) {
		Base64.Encoder encoder=Base64.getEncoder();
		
		byte[] arr= {1,2,3};
		byte[] enc=encoder.encode(arr);
		System.out.println(enc);
		
		Base64.Decoder decoder=Base64.getDecoder();
		
		byte[] denc=decoder.decode(enc);
		//System.out.println(denc);
		
		for(byte b:denc) {
			System.out.println(b);
		}
	}
}
