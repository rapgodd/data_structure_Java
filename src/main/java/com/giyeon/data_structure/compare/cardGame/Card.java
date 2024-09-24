package com.giyeon.data_structure.compare.cardGame;

/**
 * 카드 객체이다.
 * 카드 숫자와 심볼이 담겨져 있어야 하고
 * 각각의 객체의 필드 값은 한번 형성되면 바뀔 일이 전혀 없으므로
 * final을 사용한다. 그리고 얻기 위해서 다른 메서드를 사용한다.
 *
 * 나중에 이것을 숫자순으로 비교를하고 그다음에 숫자가 같으면 문자순으로 비교를 한다.
 * Comparable을 상속해야 한다.
 */
public class Card implements Comparable<Card> {

    private final int num;
    private final Suit suit;

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

    /**
     * 숫자를 먼저 비교하고
     * 그 다음에 Enum 값으로 비교를 하자.
     *
     * compareTo메서드에서는 1이 응답값으로 나와야지 순서를 바꾼다.
     */
    @Override
    public int compareTo(Card anotherCard) {
        //숫자로 비교
        if(this.num != anotherCard.num) {
            return Integer.compare(this.num, anotherCard.num);
        }else{
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", suit=" + suit +
                '}';
    }
}
