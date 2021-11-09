package algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

import alorithm.domain.Box;
import alorithm.domain.Order;
import alorithm.domain.Product;

public class OrderStreamTest {
	
	@Test
	void groupByStream() {
		
		List<Product> ProductList1 = new ArrayList();
		List<Product> ProductList2 = new ArrayList();
		List<Product> ProductList3 = new ArrayList();
		
		Product product1 = Product.builder()
				.productId(1)
				.productName("오리온상품1")
				.company("오리온")
				.build();
		Product product2 = Product.builder()
				.productId(2)
				.productName("오리온상품2")
				.company("오리온")
				.build();
		Product product3 = Product.builder()
				.productId(1)
				.company("롯데")
				.productName("롯데상품1")
				.build();
		Product product4 = Product.builder()
				.productId(2)
				.company("롯데")
				.productName("롯데상품2")
				.build();
		Product product5 = Product.builder()
				.productId(3)
				.company("롯데")
				.productName("롯데상품3")
				.build();
		ProductList1.add(product1);
		ProductList2.add(product2);
		
		ProductList2.add(product3);
		
		ProductList1.add(product4);
		ProductList3.add(product5);
		
		List<Box> boxList1 = new ArrayList();
		List<Box> boxList2 = new ArrayList();
		
		Box box1 = Box.builder()
				.boxId(1)
				.products(ProductList2)
				.build();
		boxList1.add(box1);
		Box box2 = Box.builder()
				.boxId(2)
				.products(ProductList1)
				.build();

		boxList1.add(box2);
		Box box3 = Box.builder()
				.boxId(3)
				.products(ProductList3)
				.build();
		boxList2.add(box3);
		List<Order> orderList= new ArrayList();
			
		Order order1= Order.builder()
					.orderId(1)
					.boxs(boxList2)
					.build(); 
		
		Order order2= Order.builder()
				.orderId(2)
				.boxs(boxList1)
				.build(); 
	
		orderList.add(order1);
		orderList.add(order2);
		
	
		orderList.stream()
		.forEach(System.out::println);
		System.out.println("///");
	
		orderList.stream()
		.map(Order::getBoxs)
			.forEach(System.out::println);
		
		System.out.println("///");
		
		orderList.stream()
		.flatMap(x -> x.getBoxs().stream())
		.flatMap(p -> p.getProducts().stream())
		.collect(Collectors.groupingBy(Product::getCompany))
		.forEach((k , v) -> {
			System.out.println("key : "+ k + " value: "+v);
		});


		orderList.stream()
		.flatMap(x -> x.getBoxs().stream())
		.flatMap(p -> p.getProducts().stream()) 
		.collect(Collectors.groupingBy(Product::getCompany))
		.values()
		.forEach(System.out::println);
		
		System.out.println("///");
		
		
		System.out.println("///");
		orderList.stream()
		.flatMap(x -> x.getBoxs().stream())
		.flatMap(p -> p.getProducts().stream()) 
		.collect(Collectors.groupingBy(Product::getCompany))
		.values()
		.forEach(c -> {
			for (Product p : c) {
				System.out.println(p);
			}
		});
		
		
		System.out.println("///");
		

		
		 orderList.stream()
		.flatMap(x -> x.getBoxs().stream())
		.flatMap(p -> p.getProducts().stream()) 
		.sorted(Comparator.comparing(Product::getProductId))
		.collect(Collectors.groupingBy(Product::getCompany))
		.values()
		.forEach(System.out::println);
		
	}
}
