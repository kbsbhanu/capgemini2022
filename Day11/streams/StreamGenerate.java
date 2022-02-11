package com.demo.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;
public class StreamGenerate {
	public static void  main(String ar[]) {
		Stream<String> streamGenerated =Stream.generate(() -> "Hello").limit(10);
		streamGenerated.limit(20).forEach(System.out::println);
	    }
	
	
}