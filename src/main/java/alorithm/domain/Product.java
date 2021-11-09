package alorithm.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter

@ToString
public class Product {
	Integer productId;
	String company;
	String productName;
}
