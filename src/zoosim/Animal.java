package zoosim;

import static java.lang.Math.max;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonat
 */
public abstract class Animal implements IEntity {

    String id;
    String name;
    String species;
    boolean male;
    int age;
    double posX;
    double posY;
    String Size;
    double speed;
    final int MAXSPEED;
    double direction;
    int hunger;
    int fatigue;
    Image image;
    String sound;

    @Override
    /**
     * prints the sound that the animal makes.
     */
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    /**
     * moves animal one time step.
     */
    public void move() {
        final double conversionFactor = Math.PI / 180;
        posX += max(speed * Math.cos(direction * conversionFactor), MAXSPEED);
        posY += max(speed * Math.sin(direction * conversionFactor), MAXSPEED);
    }

    @Override
    /**
     * resets animal hunger.
     */
    public void eat() {
        hunger = 0;
    }

    @Override
    /**
     * resets animal fatigue.
     */
    public void sleep() {
        fatigue = 0;
    }

    @Override
    /**
     * turns the animal's movement direction (in radians).
     *
     * @param radians
     */
    public void turn(int degrees) {
        direction += degrees;
        direction %= 360;
    }

    public void turn() {
        direction += 90;
        direction %= 360;
    }

    @Override
    public void place(int x, int y) {
        posX = x;
        posY = y;
    }
}
