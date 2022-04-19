package com.leetcode;

public class StrStr {
    public static  int strStr(String haystack, String needle) {

        //use substring instead of the inner loop because will be faster
        int index = -1;
        if(needle==null || needle.isEmpty()) return 0;
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i+j)!= needle.charAt(j))
                    break;
                if(j == needle.length()-1) return i;
            }
        }
        return index;

    }

    public static void main(String[] args) {
    String haystack = "baaaa", needle = "aa";
    System.out.println(strStr(haystack, needle));
    }
}
