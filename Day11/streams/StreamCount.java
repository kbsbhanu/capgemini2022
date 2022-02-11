package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamCount {
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Bhanu");
		memberNames.add("Jaanu");
		memberNames.add("Vaishu");
		memberNames.add("Ceegee");
		memberNames.add("leevi");
		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("V")).count();
		 
		System.out.println(totalMatched);
}
}