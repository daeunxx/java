package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

  static final int DEFAULT_INITIAL_CAPACITY = 16;
  private LinkedList<Integer>[] buckets;

  private int size = 0;
  private int capacity = DEFAULT_INITIAL_CAPACITY;

  public MyHashSetV1() {
    initBuckets();
  }

  public MyHashSetV1(int capacity) {
    this.capacity = capacity;
    initBuckets();
  }

  private void initBuckets() {
    buckets = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new LinkedList<>();
    }
  }

  private int hashIndex(int value) {
    return value % capacity;
  }

  public boolean add(int value) {
    LinkedList<Integer> bucket = buckets[hashIndex(value)];
    if (bucket.contains(value)) {
      return false;
    }
    bucket.add(value);
    size++;
    return true;
  }

  public boolean contains(int searchValue) {
    LinkedList<Integer> bucket = buckets[hashIndex(searchValue)];
    return bucket.contains(searchValue);
  }

  public boolean remove(int value) {
    LinkedList<Integer> bucket = buckets[hashIndex(value)];
    boolean result = bucket.remove(Integer.valueOf(value));
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
    return "MyHashSetV1{" +
        "buckets=" + Arrays.toString(buckets) +
        ", size=" + size +
        ", capacity=" + capacity +
        '}';
  }
}
