package com.leetcode;

public class PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(isPalindromic(s.substring(i,j+1))) {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPalindromic(String str){
        int l = 0;
        int r = str.length()-1;
        while(l<r){
            if(str.charAt(l) == str.charAt(r)) {
                r--;
                l++;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    System.out.println(countSubstrings("aaa"));
    }
}
