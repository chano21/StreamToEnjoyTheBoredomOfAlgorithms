package alorithm.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString

public class Person {
	String name;
	Integer age;
	public void changeName(String name) {
		this.name=name;
	}
}
