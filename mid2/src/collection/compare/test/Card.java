package collection.compare.test;

public class Card implements Comparable<Card> {

  private int num;
  private Suit suit;

  public Card(int num, Suit suit) {
    this.num = num;
    this.suit = suit;
  }

  public int getNum() {
    return num;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return "Card{" +
        "num=" + num +
        ", suit=" + suit +
        '}';
  }

  @Override
  public int compareTo(Card o) {
    if (this.getNum() == o.getNum()) {
      return this.getSuit().compareTo(o.getSuit());
    } else {
      return Integer.compare(this.getNum(), o.getNum());
    }
  }
}