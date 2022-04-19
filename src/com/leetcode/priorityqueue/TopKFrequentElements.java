package com.leetcode.priorityqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {
    if(nums== null || nums.length<2) return nums;

    Map<Integer, Integer> map = new HashMap<>();
    for (int elm: nums){
      map.put(elm, map.getOrDefault(elm, 0) +1);
    }
    PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a, b) -> b.getValue()- a.getValue());

    for (Map.Entry entry: map.entrySet()){
      q.add(entry);
    }
    int arr[] = new int[k];
    for (int i =0 ; i< k && !q.isEmpty(); i++){
      arr[i] = q.poll().getKey();
    }

    return arr;
  }

}
