package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

  private List<Card> cards = new ArrayList<>();

  public Deck() {
    initCards();
  }

  public List<Card> getCards() {
    return cards;
  }

  public void initCards() {
    for (int i = 0; i < 13; i++) {
      for (Suit value : Suit.values()){
        cards.add(new Card( i + 1, value));
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public void removeCard(List<Card> pickedCards) {
    for (Card card : pickedCards) {
      cards.remove(card);
    }
  }
}
