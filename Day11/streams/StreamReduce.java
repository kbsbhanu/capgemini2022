package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class StreamReduce {
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Bhanu");
		memberNames.add("Jaanu");
		memberNames.add("Vaishu");
		memberNames.add("Ceegee");
		memberNames.add("leevi");
		Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
	}
}