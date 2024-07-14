package collection.compare.test;

public class CardGameMain {

  public static void main(String[] args) {
    Deck deck = new Deck();
    Player player1 = new Player("플레이어1", deck);
    Player player2 = new Player("플레이어2", deck);

    deck.shuffle();
    player1.pick();
    player2.pick();

    Player winner = getWinner(player1, player2);

    if (winner != null) {
      System.out.println(winner.getName() + "의 승리");
    } else {
      System.out.println("무승부");
    }
  }

  static Player getWinner(Player player1, Player player2) {
    if (player1.getSum() > player2.getSum()) {
      return player1;
    } else if (player1.getSum() < player2.getSum()) {
      return player2;
    }
    return null;
  }
}
