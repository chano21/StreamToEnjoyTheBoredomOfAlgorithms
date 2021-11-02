package alorithm.functions;

import java.util.function.Function;
import java.util.function.Predicate;

public class CaculateUtils {

//	public static Predicate<Integer> filteredList= new Predicate<Integer>() {
//		@Override
//		public boolean test(Integer t) {
//			return t%2==0;
//		}
//	};

	public static Predicate<Integer> filteredList() {
		return new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}
		};
	}

	public static Function<Integer, Integer> multipleFunction() {
		return new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};
	}

//	public static Function<Integer,Integer> multipleFunction=new Function<Integer,Integer>(){
//			@Override
//			public Integer apply(Integer t) {
//				return	t * t;
//			}
//		};

}
