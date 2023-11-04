package 자바의정석;

public class AbstractClassTest2 {
    public static void main(String[] args) {
        Unit[] group = new Unit[4];
        group[0] = new Marine();

    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {};
}

class Marine extends Unit {

    void move(int x, int y) {};
    void stimPack() {};
}

class Tank extends Unit {
    void move(int x, int y) {};
    void changeMode() {};
}

class Dropship extends Unit {
    void move(int x, int y) {};
    void load() {};
    void unload() {};
}
