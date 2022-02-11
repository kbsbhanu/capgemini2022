package com.demo.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter { 
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Aaru");
		memberNames.add("Rohan");
		memberNames.add("Harini");
		memberNames.add("Shanvi");
		memberNames.add("Lori");
		
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

	}
}