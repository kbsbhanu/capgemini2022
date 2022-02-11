package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamCollect { 
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Aaru");
		memberNames.add("harini");
		memberNames.add("Rohan");
		memberNames.add("Shanvi");
		memberNames.add("Lori");
		
		
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

          System.out.print(memNamesInUppercase);
	}
}