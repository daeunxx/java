package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

  private final String name;
  private final Deck deck;
  private List<Card> cards = new ArrayList<>();
  private int sum = 0;

  public Player(String name, Deck deck) {
    this.name = name;
    this.deck = deck;
  }

  public String getName() {
    return name;
  }

  public int getSum() {
    return sum;
  }

  public void pick() {
    List<Card> pickedCards = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      Card pickCard = deck.getCards().get(i);
      pickedCards.add(pickCard);
      sum += pickCard.getNum();
    }
    this.cards = pickedCards;

    cards.sort(null);
    System.out.println(this.name + "의 카드: [" + printPickCards() + "], 합계: " + sum);
    deck.removeCard(this.cards);
  }

  private String printPickCards() {
    StringBuilder sb = new StringBuilder();
    for (Card card : cards) {
      sb.append(card.getNum() + "(" + card.getSuit().getIcon() + "), ");
    }
    sb.delete(sb.length() - 2, sb.length());
    return sb.toString();
  }
}
