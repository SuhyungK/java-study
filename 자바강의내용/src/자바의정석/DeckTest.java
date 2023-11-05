package 자바의정석;

import java.util.Arrays;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card c = deck.pick();

//        System.out.println(c);
//        System.out.println(c.toString());

        for (Card ci: deck.cardArr) {
            System.out.println(ci.toString());
        }
        deck.shuffle();

        c = deck.pick();
//        System.out.println(c);
//        System.out.println(c.toString());

        Card c1 = new Card(3, 3);

    }
}

class Card {
    static final int KIND_MAX = 4;
    static final int KIND_NUM_MAX = 13;
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    final int KIND;
    final int NUMBER;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.KIND = kind;
        this.NUMBER = number;
    }

    @Override
    public String toString() {
        return "자바의정석.Card{" +
                "kind=" + KIND +
                ", number=" + NUMBER +
                '}';
    }
}

class Deck {
    static final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    Deck() {
        for (int i = 0; i < Card.KIND_MAX; i++) {
            for (int j = 0; j < Card.KIND_NUM_MAX; j++) {
                cardArr[i*Card.KIND_NUM_MAX+j] = new Card(i+1, j+1);
            }
        }
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int) (Math.random() * 52);
        return cardArr[index];
    }

    void shuffle() {
        for (int idx = 0; idx < CARD_NUM; idx++) {
            int tmpIdx = (int) (Math.random() * 52);
            Card tmpCard = cardArr[idx];
            cardArr[idx] = cardArr[tmpIdx];
            cardArr[tmpIdx] = tmpCard;
        }
    }

    @Override
    public String toString() {
        return "자바의정석.Deck{" +
                "cardArr=" + Arrays.toString(cardArr) +
                '}';
    }
}