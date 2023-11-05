package 자바의정석;

public class RepairableTest {
    public static void main(String[] args) {
        _Tank t = new _Tank();
        SCV scv = new SCV();
        _Dropship ds = new _Dropship();

        System.out.println(ds.hitPoint);
        scv.repair(ds);
        System.out.println(ds.hitPoint);
        ds.run();
    }
}

interface Repairable {}

class _Unit {
    int hitPoint;
    final int MAX_HP;

    _Unit(int hp) {
        MAX_HP = hp;
    }

}

class GroundUnit extends _Unit {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends _Unit {
    AirUnit(int hp) {
        super(hp);
    }
}

class _Marine extends GroundUnit {
    _Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof _Unit) {
            _Unit u = (_Unit) r;
            System.out.println(u.hitPoint);
            u.hitPoint = 70;
        }
    };
}

class _Tank extends GroundUnit implements Repairable {
    _Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
}

class _Dropship extends AirUnit implements Repairable {
    _Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    void run() {
        System.out.println("좀 졸린다");
    }
}