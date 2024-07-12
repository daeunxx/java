package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

  static final int DEFAULT_INITIAL_CAPACITY = 16;
  private LinkedList<Object>[] buckets;

  private int size = 0;
  private int capacity = DEFAULT_INITIAL_CAPACITY;

  public MyHashSetV2() {
    initBuckets();
  }

  public MyHashSetV2(int capacity) {
    this.capacity = capacity;
    initBuckets();
  }

  private void initBuckets() {
    buckets = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new LinkedList<>();
    }
  }

  private int hashIndex(Object value) {
    return Math.abs(value.hashCode()) % capacity;
  }

  public boolean add(Object value) {
    LinkedList<Object> bucket = buckets[hashIndex(value)];
    if (bucket.contains(value)) {
      return false;
    }
    bucket.add(value);
    size++;
    return true;
  }

  public boolean contains(Object searchValue) {
    LinkedList<Object> bucket = buckets[hashIndex(searchValue)]; //O(1)
    return bucket.contains(searchValue); //O(n) -> O(1)
  }

  public boolean remove(Object value) {
    LinkedList<Object> bucket = buckets[hashIndex(value)];
    boolean result = bucket.remove(value);
    if (result) {
      size--;
      return true;
    } else {
      return false;
    }
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "MyHashSetV2{" +
        "buckets=" + Arrays.toString(buckets) +
        ", size=" + size +
        ", capacity=" + capacity +
        '}';
  }
}
