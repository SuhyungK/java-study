package 자바의정석;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
    }

}

class Fighter extends Unit2 implements Fightable {
    public void move(int x, int y) {};
    public void attack(Fightable fe) {};
}

class Unit2 {
    int currentHp;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {}
interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Fightable fe);
}
