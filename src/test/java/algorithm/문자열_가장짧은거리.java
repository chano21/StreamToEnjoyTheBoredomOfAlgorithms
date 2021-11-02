package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 문자열_가장짧은거리 {
//	teachermode e
	static int count =0;
	
	public static String solution(String text, String character) {
		String [] arrayText=text.split("");
		int resultArr[] = new int[arrayText.length];
		IntStream.rangeClosed(0, arrayText.length)
		.
		
//		.forEach(i ->{
//				if(arrayText[i].equals(character))	{
//					count=0;
//				}else {
//					count++;
//				}
//				resultArr[i]=count;
//			});
	
		Arrays.asList(arrayText).stream()
		.filter(s -> s.equals(character))
		.forEach(System.out::println);
		return null;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		solution("teachermode", "e");
	}
}
