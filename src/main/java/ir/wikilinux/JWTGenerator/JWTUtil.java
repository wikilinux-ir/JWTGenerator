package ir.wikilinux.JWTGenerator;

import java.util.Base64;
import java.util.Base64.Decoder;

public class JWTUtil {
	
	private static Decoder decoder = Base64.getDecoder();
	
	public static String getPayload(String jwtString) {
		
		
		
		String chunks[] = jwtString.split("\\.");
		String payload = new String(decoder.decode(chunks[1]));
		
		return payload;
		
	}
	
	public static String getHeader(String jwtString) {
		
		String chunks[] = jwtString.split("\\.");
		String header = new String(decoder.decode(chunks[1]));
		
		return header;
		
		
	}

}
