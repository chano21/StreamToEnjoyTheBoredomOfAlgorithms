package algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import alorithm.domain.Person;

public class DTO_TO_MAP {

	List<Person> personList = new ArrayList<Person>();

	@BeforeEach
	public void init() {
		for (int i = 0; i < 10; i++)
			personList.add(Person.builder().name(UUID.randomUUID().toString()).age(10 + i).build());
	}

	@Test
	@DisplayName("사람 나이순 desending")
	void person_order() {
		personList.stream()
		.forEach(System.out::println);
		System.out.println("////////////////////////////////////");
		personList.stream().sorted(Comparator.comparing(Person::getAge)
				.reversed()).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	@Test
	@DisplayName("사람 이름바꾸기")
	void person_changeName() {
		personList.stream()
		.forEach(System.out::println);
		System.out.println("////////////////////////////////////");
		personList.stream()
			.forEach(p -> p.changeName(p.getName().substring(0,5)));
		personList.stream()
		.forEach(System.out::println);
	}

	
}
