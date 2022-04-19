package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        if(numRows>1)
            res.add(List.of(1,1));
        for (int i = 2; i < numRows; i++) {
            List<Integer> x = new ArrayList<>(i);
            x.add(1);
            for (int j = 1; j < i; j++) {
                x.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            x.add(1);
            System.out.println(x);
            res.add(x);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(1));
    }
}
