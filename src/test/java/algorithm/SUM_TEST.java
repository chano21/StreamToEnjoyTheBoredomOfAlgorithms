package algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class SUM_TEST {

	List<Integer> numberList=new ArrayList<Integer>();
	
	@BeforeEach
	public void init() {
		numberList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	}
	
	@Test
	@DisplayName("sum 합계")
	void sum1() {			
		Optional<Integer> result=numberList.stream().reduce(Integer::sum);
		assertEquals(Integer.valueOf(55), result.get());
	}
	
	@Test
	@DisplayName("sum 2의 배수")
	void sum2() {			
		Optional<Integer> result=numberList.stream()
				.filter(c -> c%2==0)
				.reduce(Integer::sum);
		assertEquals(Integer.valueOf(30), result.get());
	}

}
