package com.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamMatch { 
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Bhanu");
		memberNames.add("Jaanu");
		memberNames.add("Vaishu");
		memberNames.add("Ceegee");
		memberNames.add("leevi");
		
		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);     
		 
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);     
		
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);     

}
}