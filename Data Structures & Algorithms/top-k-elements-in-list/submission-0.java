class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> m = new HashMap<>();

        // Putting numbers into has to keep track of count
        for (int num : nums) {
            if (m.get(num) == null) {
                m.put(num, 1);
            } else {
                m.put(num, m.get(num) + 1);
            }
        }

        // Finding the k frequent elements
        int[] freqArr = new int[k];
        int counter = 0;

        while (counter < k) {

            int max = 0;
            int keyOfMax = -1; // Impossible...
            for (int key : m.keySet()) {
                if (m.get(key) > max) {
                    max = m.get(key);
                    keyOfMax = key;
                }
            }
            freqArr[counter] = keyOfMax;
            counter++;
            m.put(keyOfMax, -1); // Don't recount.
        }

        return freqArr;
    }
}
