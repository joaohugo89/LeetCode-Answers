class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String first = strs[0];
        String prefix = first; // começa com a primeira string como prefixo

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // vai cortando o prefixo até dar match
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}