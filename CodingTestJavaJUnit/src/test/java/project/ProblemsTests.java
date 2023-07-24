package project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ProblemsTests {
	
	private static Stream<Arguments> GetArgumentsOne() {
		return Stream.of(
				Arguments.of(new ArrayList<Integer>(Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1)), 
						new HashSet<Integer>(Arrays.asList(5,6))),
				Arguments.of(new ArrayList<Integer>(Arrays.asList(1, 1)), 
						new HashSet<Integer>(Arrays.asList(2))),
				Arguments.of(new ArrayList<Integer>(Arrays.asList(1)), 
						new HashSet<Integer>(Arrays.asList())),
				Arguments.of(new ArrayList<Integer>(Arrays.asList()), 
						new HashSet<Integer>(Arrays.asList())),
				Arguments.of(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)), 
						new HashSet<Integer>(Arrays.asList()))
				);
		
	}
	
	private static Stream<Arguments> GetArgumentsTwo() {
		return Stream.of(
				Arguments.of(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
				Arguments.of(new int[] {3, 2, 4}, 6, new int[] {1, 2}),
				Arguments.of(new int[] {3, 3}, 6, new int[] {0, 1}),
				Arguments.of(new int[] {4, 14, 22, 30}, 4, new int[] {0, 0}),
				Arguments.of(new int[] {2}, 9, new int[] {0, 0}),
				Arguments.of(new int[] {}, 10, new int[] {0, 0})
				);
	}
	
	@ParameterizedTest
	@MethodSource("GetArgumentsOne")
	void Problem1(ArrayList<Integer> input, HashSet<Integer> output) {
		assertEquals(output, ProblemOne.SolutionOne(input),
				() -> "Input" + input + " should return " + output);
	}
	
	@ParameterizedTest
	@MethodSource("GetArgumentsTwo")
	void Problem2(int[] list, int target, int[] output) {
		assertArrayEquals(output, ProblemTwo.SolutionTwo(list, target),
				() -> "Input" + list + " target " + target + "should return " + output);
	}
	
}
