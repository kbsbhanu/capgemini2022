package com.demo.streams;

import java.util.stream.Stream;
public class StreamOfArray {
	public static void  main(String ar[]) {
		Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
		stream.forEach(p -> System.out.println(p));

}
}