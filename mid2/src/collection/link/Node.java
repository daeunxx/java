package collection.link;

public class Node {

  Object item;
  Node next;

  public Node(Object item) {
    this.item = item;
  }

  /*
  @Override
  public String toString() {
    return "Node{" +
        "item=" + item +
        ", next=" + next +
        '}';
  }
  */

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node x = this;

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
