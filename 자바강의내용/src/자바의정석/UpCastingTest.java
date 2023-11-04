package 자바의정석;

public class UpCastingTest {
    public static void main(String[] args) {
        Car car = new FireEngine();
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();


//        fe2 = car;
        fe2 = fe;

        doWork(car);
        doWork(fe);
        doWork(fe);
    }

    static void doWork(Car c) {
        if (c instanceof FireEngine) {
            System.out.println("불 남");
        } else if (c instanceof Ambulance) {
            System.out.println("응급차 옴");
        } else {
            System.out.println("차옴");
        }
    }
//    static void doWork(FireEngine fe) {
//        System.out.println("gg");
//    }
}


class Car {
    String color;
    int door;

    void drvie() {}
    void stop() {}
}


class FireEngine extends Car {
    int fire = 4;
    void water() {}
}

class Ambulance extends Car {
    void siren() {}
}
