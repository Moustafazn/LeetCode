package com.leetcode;

public class JudgeCircle {
    public static boolean judgeCircle(String moves) {
            int x = 0;
            int y = 0;
            for(char cr: moves.toCharArray()){
                if(cr=='D') y--;
                if(cr=='U') y++;
                if(cr=='L') x--;
                if(cr=='R') x++;

            }
            return x==0 && y==0;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(judgeCircle("RR"));
        System.out.println(judgeCircle("UD"));

    }
}
