class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // Otherwise, encode into hashmaps
        HashMap<Character, Integer> sHash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            if (!sHash.containsKey(s.charAt(i))) {
                sHash.put(s.charAt(i), 0);
            } else {
                sHash.put(s.charAt(i),sHash.get(s.charAt(i)) + 1);
            }
        }

        HashMap<Character, Integer> tHash = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {

            if (!tHash.containsKey(t.charAt(i))) {
                tHash.put(t.charAt(i), 0);
            } else {
                tHash.put(t.charAt(i),tHash.get(t.charAt(i)) + 1);
            }
        }
        
        // Now compare
        if (sHash.equals(tHash)) return true;
        else return false;
    }
}
