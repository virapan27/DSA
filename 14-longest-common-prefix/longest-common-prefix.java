class Solution {
    //Approach 1
    // public String longestCommonPrefix(String[] strs) {
    //     if (strs == null || strs.length == 0) {
    //         return "";
    //     }

    //     String prefix = strs[0];
    //     for(int i = 1; i <= strs.length - 1; i++) {
    //         while(!strs[i].startsWith(prefix)) {
    //             prefix = prefix.substring(0, prefix.length() - 1);

    //             if (prefix.length() == 0) {
    //                 return "";
    //             }
    //         }
    //     }
    //     return prefix;

    // }

    //approach 2

    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for(int i = 0; i < first.length(); i++){
            char current = first.charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || current != strs[j].charAt(i)){
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}