package 자바의정석;

import java.util.Vector;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv2 t = new Tv2();
        Computer com = new Computer();
        Audio a = new Audio();

        b.buy(t);
        b.buy(com);
        b.buy(a);
        b.buy(com);

        b.summary();;

        b.refund(com);

        b.summary();
        System.out.println(b.money + "만큼 남았다");
    }
}

class Product {
    int price;
    int bonusPrice;
    Product(int price) {
        this.price = price;
        this.bonusPrice = (int) (price / 10.0);
    }

    Product() {};
}

class Tv2 extends Product {
    Tv2() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv2{}";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer{}";
    }

}

class Audio extends Product {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio{}";
    }
}

class Buyer extends Object {
    int money = 1000;
    int bonusPrice = 0;
    Vector items = new Vector();


    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족한데");
            return;
        }
        money -= p.price;
        bonusPrice += p.bonusPrice;
        items.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product p) {
        if (items.remove(p)) { // 저장된 객체 삭제가 성공하면 true, 실패하면 false
            money += p.price;
            bonusPrice -= p.bonusPrice;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("그런 거 산 적 없는데요?ㅜ");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < items.size(); i++) {
            Product p = (Product) items.get(i); // 자식 클래스 인스턴스이기 때문에 부모 클래스 타입 참조변수로자동 형변환이 안 된다.
            sum += p.price;
            itemList += p + ", ";
        }

        System.out.println("현재까지 구입한 가격은 " + sum);
        System.out.println("현재까지 구매한 물품은 " + itemList);
    }
}