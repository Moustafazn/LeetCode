package com.leetcode.priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFrequentWords {

  public List<String> topKFrequent(String[] words, int k) {
    if(words== null || words.length<2) return List.of();

    Map<String, Integer> map = new LinkedHashMap<>();
    for (String word: words){
      map.put(word, map.getOrDefault(word, 0) +1);
    }
    PriorityQueue<WordFrequency> q = new PriorityQueue<>(new SortByFrequency());

    for (Map.Entry<String, Integer> entry: map.entrySet()){
      q.offer(new WordFrequency(entry.getKey(), entry.getValue()));
    }
    List<String> freq = new ArrayList<>();
    for (int i =0 ; i< k && !q.isEmpty(); i++){
      freq.add(q.poll().word);
    }

    return freq;
  }


  class WordFrequency {
    String word;
    int frequency;

    public WordFrequency(String word, int frequency) {
      this.word = word;
      this.frequency = frequency;
    }
  }

  class SortByFrequency implements Comparator<WordFrequency> {

    @Override
    public int compare(WordFrequency w1, WordFrequency w2) {
      int frequencyComparison = w2.frequency - w1.frequency;
      if (frequencyComparison != 0)
        return frequencyComparison;

      return w1.word.compareTo(w2.word);
    }

  }
}
