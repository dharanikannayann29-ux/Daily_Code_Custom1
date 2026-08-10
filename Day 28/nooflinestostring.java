class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int lines = 1;
        int width = 0;

        for (int i = 0; i < s.length(); i++) {

            int w = widths[s.charAt(i) - 'a'];

            if (width + w > 100) {
                lines++;
                width = 0;
            }

            width = width + w;
        }

        return new int[]{lines, width};
    }
}