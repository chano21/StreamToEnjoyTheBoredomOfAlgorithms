package algorithm;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class cacluateTest {
	List<Integer> list = List.of(1,2,5,2,3,4,7,-233,33,11,4422,123,21512,132,21);

	private static int sum(int a, int b) {
		System.out.println(a + " " + b +" ="+ a+b);
		return a+b;
	}

	private static int sum3(int a, int b, int c) {
		System.out.println(a + " " + b + " "+ c+ "  ="+ a+b+c);
		return a+b+c;
	}

	@Test
	@DisplayName("Cacluate list in sum value")
	void cacluateListofSumValue() {
		Integer sum = list.stream().reduce(0, (x,y)-> x+y);
		assertEquals(Integer.valueOf(26045) , sum);
	}

	@Test
	@DisplayName("Cacluate list in max value")
	void cacluateListofMaxValue() {
		Integer max = list.stream().reduce(Integer.MIN_VALUE, (x,y)-> y>x?y:x);
		assertEquals(Integer.valueOf(21512) , max);

		//		System.out.println(max);
	}

	
}
