class Solution {
    public int countAsterisks(String s) {
        boolean insideBars = false;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                insideBars = !insideBars;  // toggle
            } else if (c == '*' && !insideBars) {
                count++;
            }
        }
        return count;
    }
}
