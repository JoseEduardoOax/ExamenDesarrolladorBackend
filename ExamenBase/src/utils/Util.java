package utils;

import java.util.Random;
import java.util.stream.Stream;

public class Util {
	public static String randomAlphaNumericString(int longitud) {
		int caracterInicio = 48; // 0
		int caracterFinal = 122; // z
		Random random = new Random();
		
		return random.ints(caracterInicio, caracterFinal + 1)
				.filter(i -> Character.isAlphabetic(i) || Character.isDigit(i))
				.limit(longitud)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString()
				.toUpperCase();
	}
	
	public static String randomNombre() {
		int caracterInicio = 97; // letter 'a'
	    int caracterFinal = 122; // letter 'z'
	    
	    Random random = new Random();
	    
	    int size = 4 + random.nextInt(15);

	    return random.ints(caracterInicio, caracterFinal + 1)
	      .limit(size)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	}
	
	public static float IMC(float peso, float altura) {
		return peso / (altura * altura);
	}

}
