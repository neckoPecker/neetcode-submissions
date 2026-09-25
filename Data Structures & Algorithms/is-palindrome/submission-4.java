class Solution {
    public boolean isPalindrome(String s) {

        // Process the array
        s = s.replaceAll("[^a-zA-z0-9]", "");
        s = s.toLowerCase();

        char[] a = s.toCharArray();
        for (int i = 0; i < Math.floor(a.length / 2); i++) {
            char tmp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = tmp;

            System.out.println("Iteration: " + i + Arrays.toString(a));
        }

        // Check it out now
        return Arrays.equals(a, s.toCharArray());
    }
}
