package com.demo.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Bhanu");
		memberNames.add("Jaanu");
		memberNames.add("Vaishu");
		memberNames.add("Ceegee");
		memberNames.add("leevi");
	
	memberNames.stream().filter((s) -> s.startsWith("B")).map(String::toUpperCase).forEach(System.out::println);
}
}