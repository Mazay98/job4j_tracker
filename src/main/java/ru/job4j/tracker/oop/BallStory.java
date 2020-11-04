package ru.job4j.tracker.oop;

class Ball {
}

class Hare {
    public void tryEat(Ball ball) {

    }
}

class Wolf {
    public void tryEat(Fox fox) {

    }
}

class Fox {
    public void tryEat(Hare hare) {

    }
}

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf woolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        fox.tryEat(hare);
        woolf.tryEat(fox);
    }
}
