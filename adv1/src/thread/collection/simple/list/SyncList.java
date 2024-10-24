package thread.collection.simple.list;

import static util.ThreadUtils.sleep;

import java.util.Arrays;

public class SyncList implements SimpleList {

  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elements;
  private int size = 0;

  public SyncList() {
    elements = new Object[DEFAULT_CAPACITY];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public synchronized void add(Object object) {
    elements[size] = object;
    sleep(100);
    size++;
  }

  @Override
  public synchronized Object get(int index) {
    return elements[index];
  }

  @Override
  public synchronized String toString() {
    return Arrays.toString(Arrays.copyOf(elements, size)) +
        " size=" + size + ", capacity=" + elements.length;
  }
}
