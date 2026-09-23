class Solution {
    public boolean isAnagram(String s, String t) {
        
        // easy case
        if (s.length() != t.length()) return false;


        // not-so straight-forwards case
        int[] counts = new int[26];

        for (char c : s.toCharArray()) {
            counts[c - 97]++;
        }
        for (char c : t.toCharArray()) {
            counts[c - 97]--;
        }

        for (int count : counts) {
            if (count != 0) return false;
        }

        return true;
    }
}
