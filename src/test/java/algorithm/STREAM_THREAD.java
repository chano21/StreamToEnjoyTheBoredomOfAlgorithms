package algorithm;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class STREAM_THREAD {
	
	@Test
	@DisplayName("병렬 테스트")
	public void ParallelTest() throws InterruptedException, ExecutionException {

ForkJoinPool myPool = new ForkJoinPool(5);
		myPool.submit(() -> {
		  IntStream.range(0, 10).parallel().forEach(index -> {
		    System.out.println("Starting " + Thread.currentThread().getName() + ", index=" + index + ", " + new Date());
		    try {
		      Thread.sleep(1);
		    } catch (InterruptedException e) {
		    }
		  });
		}).get();
		
	System.out.println("끝");
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.parallelStream().forEach(index -> {
			System.out.println("Starting " + Thread.currentThread().getName() 
				+ ", index=" + index + ", " + new Date());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) { }
		});
	
	}
}
