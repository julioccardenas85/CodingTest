package project;

public class ProblemTwo {

	public static void main(String[] args) {
		//Variables
		int[] nums2 = {3, 3}; //Change here input values
		int target = 6; //Change here input values
		int[] output2 = new int[2];
		
		//Output
		System.out.println("Problem two output:");
		if(nums2.length < 2) {
			System.out.println("There aren't enough numbers to compare, there must been two numbers at least.");
		} else {
			output2 = SolutionTwo(nums2, target);
			
			if (output2[1] == 0) {
				System.out.println("No matches found in the given numbers.");
			} else {
				System.out.println(output2[0] + ", " + output2[1]);
			}
		}
		
	}

	static int[] SolutionTwo(int[] list, int goal) {
		int[] result = new int[2];
		
		for(int i = 0; i < list.length-1; i++) {
			if(list[i] < goal) {
				for(int j = i+1; j < list.length; j++) {
					if((list[i] + list[j]) == goal) {
						result[0] = i;
						result[1] = j;
						return result;
					}
				}
			}
		}
		
		return result;
	}
	
}
