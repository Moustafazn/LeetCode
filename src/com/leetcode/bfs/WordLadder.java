package com.leetcode.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class WordLadder {

  public static boolean checkString(String str1, String str2){
    if (str1 == null || str2 == null)
      return str1 == null && str2 == null;
    if (str1.length() != str2.length())
      return false;
    int count = 0;
    for(int i=0; i<str1.length(); i++){
      if(str1.charAt(i)!= str2.charAt(i)) count++;
    }
    return count==1;
  }

  public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

    if (wordList == null || beginWord == endWord)
      return 0;
    if (!wordList.contains(endWord))
      return 0;

    wordList.add(beginWord);
    int[] distance = new int[wordList.size()];
     bfs(wordList.size()-1, wordList,distance);
    for (int i = 0; i < wordList.size(); i++)
      if (wordList.get(i).equals(endWord) && distance[i] != Integer.MAX_VALUE)
        return distance[i] + 1;

    return 0;
  }

  static void bfs(int start, List<String> wordList, int[] distance) {
    int INF = Integer.MAX_VALUE;
    Arrays.fill(distance, INF);
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    distance[start] = 0;

    while (!queue.isEmpty()){
      int parent = queue.poll();

      for (int i = 0; i < wordList.size(); i++) {
       if (distance[i] == INF && checkString(wordList.get(parent), wordList.get(i))) {
          distance[i]= distance[parent] + 1;
          queue.add(i);
        }
      }
    }
  }

  public static void main(String[] args) {
    String[] arr= {"hot","dot","dog","lot","log","cog"};
    System.out.println(ladderLength("hit","cog",
        Arrays.stream(arr).collect(Collectors.toList())));

  }
}
