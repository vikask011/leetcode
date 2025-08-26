class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;

        while (i < n1 || i < n2) {
            if (i < n1) {
                merged.append(word1.charAt(i));
            }
            if (i < n2) {
                merged.append(word2.charAt(i));
            }
            i++;
        }

        return merged.toString();
    }
}