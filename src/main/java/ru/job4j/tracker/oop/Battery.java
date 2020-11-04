package ru.job4j.tracker.oop;

public class Battery {
    private int value;

    public Battery(int value){
        this.value = value;
    }

    public void exchange(Battery another){
        another.value += this.value;
        this.value = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(10);
        Battery battery2 = new Battery(5);

        battery1.exchange(battery2);
    }
}
