package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import alorithm.functions.CaculateUtils;

public class fibonaci_function {

//	@Test
	public void finbonaciWithFunctionJava8NoArray() {
// 0 1
// 1 1
// 1 2
// 2 3
// 3 5
		int series = 15;
		List<Integer> result = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(series)
				.map(t -> t[0]).collect(Collectors.toList());
		System.out.println(result);

		int sum = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(8).map(t -> t[0])
				.mapToInt(Integer::intValue).sum();

		System.out.println("Total : " + (sum + 1));

	}

	@Test
	@DisplayName("배열형식의 스트림 1 - 10 fibonachi")
	public void finbonaciWithFunctionJava8Array() {
		int end = 10;

		// Stream.iterate(new int[] {0,1}, t -> new int[] {t[0],t})

//		List<Person> personList = new ArrayList<Person>();
//			for (int i = 0; i < 10; i++)
//				personList.add(Person.builder().name(UUID.randomUUID().toString()).age(10 + i).build());

//		TestResult test =TestResult.builder()
//		.messages(personList)
//		.count(0)
//		.build();
//		System.out.println(test);

//		List<Integer> sum = Stream.it

		// IntStream.rangeClosed(1, end)

		// .reduce(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		// ;

//	List<Integer> dataList=IntStream.rangeClosed(1, end)
//				.boxed()
//				.collect(Collectors.toList());

		// Integer sum = list.stream().reduce(0, (x,y)-> x+y);

//	dataList.stream().reduce(0, (x,y)->)
		// public static IntStream iterate(int seed, IntPredicate hasNext,
		// IntUnaryOperator next) {

//		IntStream.iterate(end, null)

//				.forEach(System.out::println);

	}

	@Test
	@DisplayName("곱하기")
	public void function_multiple_mathTest() {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		list.stream()
//		//.filter(CaculateUtils::filteredList)
//		.map(CaculateUtils::multipleFunction)
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
	}

//	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer){
//		  for(Integer integer:listOfIntegers){
//		    consumer.accept(integer);
//		  }
//		 }	

	public static Predicate<Integer> filteredList= new Predicate<Integer>() {

		@Override
		public boolean test(Integer t) {
			System.out.println("필터 :  "  +t);
			return t%2==0;
		}
		
	};
	public Function<Integer,Integer> multipleFunction(){
		return new Function<Integer,Integer>(){
			@Override
			public Integer apply(Integer t) {
				return	t * t;
			}
		};
	}

}
