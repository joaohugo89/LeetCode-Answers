class Solution {
    public int strStr(String haystack, String needle) {

        boolean match = true;
        int output = -1;
        String word = new String();       
        for (int i = 0; i < haystack.length(); i++) {
            if ((haystack.length() - i) < needle.length()){
                break;
            } 
            if (output != -1){
                break;
            }
            
            if (haystack.charAt(i) == needle.charAt(0)){
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i+j) == needle.charAt(j)){
                        match = true;
                    }else{
                        match = false;
                        break;
                    }
                }
                if (match){
                    output = i;
                }
            }

        }
        return output;
    }
}