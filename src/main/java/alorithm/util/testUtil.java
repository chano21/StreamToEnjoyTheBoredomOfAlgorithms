package alorithm.util;

import java.security.SecureRandom;
import java.util.Random;

public class testUtil {
	private static final SecureRandom random = new SecureRandom();
	   public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
	        int x = random.nextInt(clazz.getEnumConstants().length);
	        return clazz.getEnumConstants()[x];
	    }
}
