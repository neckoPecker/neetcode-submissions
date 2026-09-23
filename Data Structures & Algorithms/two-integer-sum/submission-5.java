class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                // Notice that i is put in second. It's because the previous index
                // is, by logical progression of the code, less to i
                int[] sol = {map.get(target - nums[i]), i};
                return sol;
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
