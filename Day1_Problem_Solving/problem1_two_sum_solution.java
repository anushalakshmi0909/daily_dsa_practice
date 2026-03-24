/*Goal:
Find two numbers in the array that add up to the target
and return their indices.

Approach 1: Brute Force
Time Complexity: O(n^2)
Space Complexity: O(1)

Idea:
Check every pair of numbers and see if their sum equals the target.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute force approach
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

/*
Approach 2: HashMap (Optimized)
Time Complexity: O(n)
Space Complexity: O(n)

Idea:
For each number, check if the complement (target - number)
already exists in the hashmap.
If yes, return the indices.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Optimized approach : HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
