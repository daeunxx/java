package collection.link;

public class MyLinkedListV3<E> {

  private Node<E> first;
  private int size = 0;

  public Node<E> getNode(int index) {
    Node<E> x = first;
    for (int i = 0; i < index; i++) {
      x = x.next;
    }
    return x;
  }

  private Node<E> getLastNode() {
    Node<E> x = first;
    while (x.next != null) {
      x = x.next;
    }
    return x;
  }

  public void add(E e) {
    Node<E> newNode = new Node<>(e);
    if (first == null) {
      first = newNode;
    } else {
      Node<E> lastNode = getLastNode();
      lastNode.next = newNode;
    }
    size++;
  }

  //추가 코드
  public void add(int index, E e) {
    Node<E> newNode = new Node<>(e);
    if (index == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      Node<E> prev = getNode(index - 1);
      newNode.next = prev.next;
      prev.next = newNode;
    }
    size++;
  }

  //추가 코드
  public E remove(int index) {
    Node<E> removeNode = getNode(index);
    E removedItem = removeNode.item;

    if (index == 0) {
      first = removeNode.next;
    } else {
      Node<E> prev = getNode(index - 1);
      prev.next = removeNode.next;
    }

    removeNode.item = null;
    removeNode.next = null;
    size--;
    return removedItem;
  }

  public E set(int index, E e) {
    Node<E> x = getNode(index);
    E oldValue = x.item;
    x.item = e;
    return oldValue;
  }

  public E get(int index) {
    Node<E> node = getNode(index);
    return node.item;
  }

  public int indexOf(E e) {
    Node<E> x = first;
    int index = 0;

    while (x != null) {
      if (x.item.equals(e)) {
        return index;
      }
      index++;
      x = x.next;
    }
    return -1;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "MyLinkedListV1{" +
        "first=" + first +
        ", size=" + size +
        '}';
  }

  private static class Node<E> {

    E item;
    Node<E> next;

    public Node(E item) {
      this.item = item;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      Node<E> x = this;

      sb.append("[");

      while (true) {
        sb.append(x.item);
        x = x.next;
        if (x == null) {
          break;
        }
        sb.append("->");
      }

      sb.append("]");
      return sb.toString();
    }
  }
}
