package alorithm.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Person {
	String name;
	String email;
	Integer age;
	Address address;
	PersonEnums.Gender gender;
	public void changeName(String name) {
		this.name=name;
	}
}
