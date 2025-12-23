package shop_27_25;

public class Animal {
    String name;
    int age, legs, hunger, speedKm;
    boolean mefrisParsa, isPredidtor, isAlive;

    public Animal(String name, int age, int legs, int hunger, int speedKm, boolean mefrisParsa, boolean isPredidtor) {
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.hunger = hunger;
        this.speedKm = speedKm;
        this.mefrisParsa = mefrisParsa;
        this.isPredidtor = isPredidtor;
        this.isAlive = true;
    }
}
