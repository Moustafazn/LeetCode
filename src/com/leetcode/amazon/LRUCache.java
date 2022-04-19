package com.leetcode.amazon;


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Cache {
  int value;
  int key;
  Cache(int key, int value){
    this.key = key;
    this.value  = value;
  }
}
public class LRUCache {
  private Deque<Integer> LeastRecUsedQueue = new LinkedList<>();
  private Map<Integer, Cache> elemCacheMap = new HashMap<>();
  private final int cacheSize;

  LRUCache(int cacheSize){
    this.cacheSize = cacheSize;
  }

  // This function is used to get the elements from the cache
  public Integer getElemFromCache(int key){
    if(elemCacheMap.containsKey(key)){
      Cache curr = elemCacheMap.get(key);
      LeastRecUsedQueue.remove(curr.key);
      LeastRecUsedQueue.addFirst(curr.key);
      return curr.value;
    }
    return -1;
  }

  /* This function is used to put the elements in the cache
    * This function removes the least recent used element while putting new element
    * in case of the queue size exceeds the cache limit
   */
  public void putElemInCache(int key, int value){
    if(elemCacheMap.containsKey(key)) {
      Cache curr = elemCacheMap.get(key);
      LeastRecUsedQueue.remove(curr.key);
    }else{
      if(LeastRecUsedQueue.size()== cacheSize){
        int temp = LeastRecUsedQueue.getLast();
        elemCacheMap.remove(temp);
      }
      Cache newCache = new Cache(key, value);
      LeastRecUsedQueue.addFirst(newCache.key);
      elemCacheMap.put(key, newCache);
    }
  }

  // print the current elements in the cache
  public void printAllCacheElements(){
    for (Map.Entry<Integer, Cache> entry: elemCacheMap.entrySet())
      System.out.print(entry.getKey()+ "   ");

    System.out.println();
  }


  public static void main(String[] args) {
    LRUCache lruCache = new LRUCache(3);
    lruCache.putElemInCache(1, 1);
    lruCache.putElemInCache(2, 2);
    lruCache.putElemInCache(3, 3);
    System.out.println(lruCache.getElemFromCache(1));
    lruCache.printAllCacheElements();
    lruCache.putElemInCache(4, 4);
    lruCache.printAllCacheElements();
    System.out.println(lruCache.getElemFromCache(2));
    System.out.println(lruCache.getElemFromCache(4));

  }
}
