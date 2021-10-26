package alorithm.response;

import java.util.List;

import lombok.Builder;
//import java.util.stream.BaseStream;
//import java.util.stream.Stream;
//
//public interface Stream<T> extends BaseStream<T, Stream<T>> {
import lombok.ToString;

@Builder
@ToString
public class TestResult{
	List<?> messages;
	int count;
}
