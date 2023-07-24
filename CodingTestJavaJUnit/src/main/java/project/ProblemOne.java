package project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ProblemOne {

	public static void main(String args[]) {
		//Variables
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1)); //Change here input values
		HashSet<Integer> output = new HashSet<Integer>();
		
		//Output
		System.out.println("Problem one output:");
		if(nums.size() < 2) {
			System.out.println("It wasnt given enough numbers to compare, there must be at least two numbers.");
		} else {
			output = SolutionOne(nums);
			
			if (output.size() == 0) {
				System.out.println("No result because all of the numbers given were found in the range.");
			} else {
				System.out.println(output);
			}
		}
		
	}
	
	static HashSet<Integer> SolutionOne(ArrayList<Integer> list) {
		HashSet<Integer> result = new HashSet<Integer>();
		
		for(int i = 1; i <= list.size(); i++) {
			if(!list.contains(i)) {
				result.add(i);
			}
		}
		
		return result;
	}
}
