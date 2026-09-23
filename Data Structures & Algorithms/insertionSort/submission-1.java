// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {

    private List<Pair> deepCopy(List<Pair> pairs) {
        List deepCopy = new ArrayList();
        for (int i = 0; i < pairs.size(); i++) {
            deepCopy.add(new Pair(pairs.get(i).key, pairs.get(i).value));
        }
        return deepCopy;
    }

    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> output = new ArrayList<List<Pair>>();

        // Edge case
        if (pairs.size() == 0) return List.of();

        output.add(deepCopy(pairs));

        for (int i = 1; i < pairs.size(); i++) {
            for (int j = i; j > 0; j--) {
                // Each row acts like a state
                if (pairs.get(j).key < pairs.get(j-1).key) {
                    // Swap
                    Pair tmp = pairs.get(j);
                    pairs.set(j, pairs.get(j-1));
                    pairs.set(j-1, tmp);
                }
            }

            // Save the state
            output.add(deepCopy(pairs));
        }

        return output;
    }
}
