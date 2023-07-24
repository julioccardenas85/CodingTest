# CodingTest
Author: Julio Cardenas

Coding test with two problems coded in Java - Maven, with tests in JUnit5.

Inside src/main/java/project there are two classes, one for each problem.

***PROBLEM 1***
Given a list nums of n integers where nums[i] is in the range [1, list length], write a function that solves the following problem; return a list of all the integers in the range [1, list length] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]

SOLUTION:
Input values are received in an ArrayList because it's possible to have duplicate values and this collection has that feature. Using the "size" method I determined the cycles of the first "for loop" that will search for the number "i", starting from 1 until the array size number, which is the range that we have to check. Then, in a nested conditional "if" we compare if the number "i" is contained in the input array list, if it doesn't, it'll be added to the result variable. Thanks to this output can't have duplicate numbers and is needed to add items dynamically, the result uses the HashSet collection that allow us to do that and use more methods in constant time. To finish the process, I returned the result variable to the main method.

Inside the main, I coded different outputs depending on the input and/or output values. There's an specific response in case there weren't given enough input numbers, in case all the numbers given were found in the range, or successful response when we get returning values.

Time complexity in worst case: O(n^2).
Space complexity: O(1).

***PROBLEM 2***
Given a list of integers nums and an integer target, write a function that solves the following problem; return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the
same element twice. You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

SOLUTION:
The solution method receives an array with the values to check and an int variable that represents the target we are looking for. The array is used because is needed to access every element for its index, and the size is fixed. With the first "for loop" we search all over the array for the first value of the sum. Then, before getting to the second loop, with an "if" conditional I discarded any number higher than the target to reduce processing cycles. After that, the second "for loop" will search for the second sum value, it starts with the next index of the first loop to avoid re-checking previous values. Then the sum is executed and if the result is equal than the target, both indexes are assigned to the result array, which have a fixed size of 2 because we always look for two values. If the target is found, the method will return the result to main and stop further processing. In case that the target wasn't found, the method will return an empty array with both values "0".

As for Problem One, the main will show an output according to the input and/or output values.

Time complexity in worst case: O(n log n).
Space complexity: O(1).

***TESTS***
Test cases were added using JUnit5 with a Java-Maven project in the path src/main/java/project. The example cases given in the problems were tested, and also other scenarios where we expect to get unsuccessful responses.
