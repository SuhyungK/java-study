package 자바의정석;

public class AbstractClassTest {
    public static void main(String[] args) {

    }
}

abstract class Player {
    boolean pause;
    int currentPos;

    Player() {
        this.pause = false;
        this.currentPos = 0;
    }

    abstract void play(int pos);
    abstract void stop();

    void play() {
        play(currentPos);
    }

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }
}

class CDPlayer extends Player {
    void play(int currentPos) {

    }

    void stop() {

    }
}

class AudioPlayer extends Player {
    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }
}

abstract class AbstractPlayer extends Player {
    @Override
    void stop() {

    }

    @Override
    void play(int pos) {

    }

    abstract void dance();
}