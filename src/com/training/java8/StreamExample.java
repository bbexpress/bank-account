package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6);
		
		//List<Integer> square = num.stream().map(n -> n * n).collect(Collectors.toList());
		
		System.out.println("Displaying Numbers::");
		//num.stream().map(n -> n*n).forEach(x -> System.out.println(x));
		num.stream().map(n -> n*n).forEach(System.out::println);  //method reference
		
		int sum = num.stream().map(n ->n*n).reduce(0, (ans, i) -> ans+i);
		System.out.println("Sum of squares is: " + sum);
		
//		System.out.println("Displaying number::");
//		for(Integer i:square) {
//			System.out.println(i);
//		}
		
		List<String> names = Arrays.asList("Stream", "Sigma", "Reflect", "Java");
		List<String> namesWithS = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		
		System.out.println("Displaying names::");
		for(String name:namesWithS) {
			System.out.println(name);
		}
	}

}
