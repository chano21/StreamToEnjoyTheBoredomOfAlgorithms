package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class fibonaci_function {

	@Test
	public void finbonaciWithFunctionJava8NoArray() {
// 0 1
// 1 1
// 1 2
// 2 3
// 3 5
		int series=15;
	List<Integer> result=
		Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
        .limit(series)
        .map(t -> t[0])
        .collect(Collectors.toList());
	System.out.println(result);

	int sum = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
			.limit(8)
			.map(t -> t[0])
			.mapToInt(Integer::intValue)
			.sum();

	    System.out.println("Total : " + (sum+1));
	    
	}

	@Test
	@DisplayName("배열형식의 스트림 1 - 10 fibonachi")
	public void finbonaciWithFunctionJava8Array() {
		int end=10;

	//	Stream.iterate(new int[] {0,1}, t -> new int[] {t[0],t})
		
		
//		List<Person> personList = new ArrayList<Person>();
//			for (int i = 0; i < 10; i++)
//				personList.add(Person.builder().name(UUID.randomUUID().toString()).age(10 + i).build());

//		TestResult test =TestResult.builder()
//		.messages(personList)
//		.count(0)
//		.build();
//		System.out.println(test);
		
		
//		List<Integer> sum = Stream.it
				
				
				//IntStream.rangeClosed(1, end)
				
				//.reduce(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
				//;
		
		
//	List<Integer> dataList=IntStream.rangeClosed(1, end)
//				.boxed()
//				.collect(Collectors.toList());

	//		Integer sum = list.stream().reduce(0, (x,y)-> x+y);

//	dataList.stream().reduce(0, (x,y)->)
	//    public static IntStream iterate(int seed, IntPredicate hasNext, IntUnaryOperator next) {

		
//		IntStream.iterate(end, null)
	
//				.forEach(System.out::println);
		
	}
	@Test
	@DisplayName("곱하기")
	public void function_multiple_mathTest() {
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	//Function<String, Integer> f = str -> Integer.parseInt(str);
	
	Function<Integer,Integer> mathFunction = x -> x * 2;
	
//    List<Integer> result = math(list, x -> x * 2);

    System.out.println(result); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

	}

//public static <T> List<T> math(List<T> list, UnaryOperator<T> uo) {
//    List<T> result = new ArrayList<>();
//    for (T t : list) {
//        result.add(uo.apply(t));
//    }
//    return result;
//}

	public static Function<List<?>,Integer> math(List<?> list, UnaryOperator<?> uo) {
	    List<?> result = new ArrayList<>();
	    for (? t : list) {
	        result.add(uo.apply(t));
	    }
	    return result;
	}

}
