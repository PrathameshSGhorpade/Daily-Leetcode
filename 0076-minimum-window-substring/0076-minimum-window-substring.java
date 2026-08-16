class Solution {
    public String minWindow(String s, String t) {

        int[] need = new int[256];
        int l = 0, r = 0;
        int n = s.length(), m = t.length();
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1, count = 0;

        for (int i = 0; i < m; i++) {
            need[t.charAt(i)]++;
        }

        while (r < n) {
            if (need[s.charAt(r)] > 0) {
                count++;
            }
            need[s.charAt(r)]--;

            while (count == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    sIndex = l;
                }

                need[s.charAt(l)]++;
                if (need[s.charAt(l)] > 0) {
                    count--;
                }
                l++;
            }
            r++;
        }

        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);
    }
}