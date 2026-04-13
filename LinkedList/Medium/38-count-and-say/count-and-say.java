class Solution {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        return build(prev);
    }

    private String build(String s) {
        StringBuilder result = new StringBuilder();
        process(s, 0, result);
        return result.toString();
    }

    private void process(String s, int index, StringBuilder result) {
        if (index >= s.length()) return;

        char current = s.charAt(index);
        int count = 0;

        while (index < s.length() && s.charAt(index) == current) {
            count++;
            index++;
        }

        result.append(count).append(current);
        process(s, index, result);
    }
}