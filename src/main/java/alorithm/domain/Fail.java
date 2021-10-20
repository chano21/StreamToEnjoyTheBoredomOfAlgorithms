package alorithm.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.ToString.Exclude;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Fail {
	int success;
	int fail;
	int total;
	@Exclude
	List<Person> persons;	
	
	public void updateSuccess() {
		this.success++;
	}

	public void updateFail() {
		this.fail++;
	}
	
	public void updaetPersons(Person person) {
		if(this.persons==null) {
			this.persons=new ArrayList<Person>();	
		}
		this.persons.add(person);
	}
	
}
