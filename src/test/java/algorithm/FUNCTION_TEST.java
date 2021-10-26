package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import alorithm.domain.Address;
import alorithm.domain.Fail;
import alorithm.domain.Person;
import alorithm.domain.PersonEnums.Gender;

public class FUNCTION_TEST {

	@Test
	@DisplayName("person to convert validatePersons")
	void personCheckValidate() {
		List<Person> personList= new ArrayList();

		final int parallelism = 4;
		
		ForkJoinPool forkJoinPool = null;
		
		
		for(int i =0; i<50000000; i++) {
			String name = UUID.randomUUID().toString();
			personList.add(
					Person.builder()
					.address(Address.builder()
							.baseAddress("기본주소"+i)
							.detailAddress("자세한주소"+i)
							.build())
					.name(name)
		//			.gender(Gender.values()[new Random().nextInt(Gender.values().length)])
					.gender(Gender.MAN)
//					.age((int)(Math.random() * 20) + 1)
					.age(20)
				.email(name+"@gmail.com")
					.build());
		}
				//personList.forEach(System.out::println); //생성했으면.. validate 체크해야지.
		Fail fail =Fail.builder()
		.fail(0)
		.success(0)
		.build();
		
		    
		personList.stream().parallel()
				.filter(p -> p.getGender().equals(Gender.MAN))
				.forEach(p ->{
								if(p.getAge()>=19) {
									fail.updateSuccess();
								}else {
									fail.updateFail();
									fail.updaetPersons(p);
								}
							}
						);
		
		System.out.println(fail);		
//		fail.getPersons().forEach(System.out::println);
			
		//.collect(Collectors.toList());
			
	}

	@Test
	@DisplayName("Cacluate list in sum value")
	void cacluateListofSumValue() {
		List<Integer> list = List.of(1,2,5,2,3,4,7,33,11,4422,123,21512,132,21);
		Integer sum = list.stream().reduce(0, (x,y)->x+y);
		System.out.println(sum);
	}
}
