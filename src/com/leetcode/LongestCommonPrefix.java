package com.leetcode;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder f = new StringBuilder();
        char[] chars = strs[0].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            f.append(chars[i]);
            int count =0;
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].indexOf(f.toString())== 0) {
                    count++;
                }
            }
            if(count < strs.length) f.deleteCharAt(f.length()-1);
            if(i==0 && f.length()==0) return f.toString();

        }
        return f.toString();

    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
