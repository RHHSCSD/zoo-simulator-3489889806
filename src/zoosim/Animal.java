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

    /**
     *
     * @param name name of the animal.
     * @param species species of the animal.
     * @param x x position of the animal.
     * @param y y position of the animal.
     */
    public Animal(String name, String species, int x, int y) {
        this.name = name;
        this.species = species;
        this.posX = x;
        this.posY = y;
        this.hunger = 0;
        this.direction = 0;
        this.fatigue = 0;
    }

    /**
     * prints the sound that the animal makes.
     */
    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    /**
     * moves animal one time step.
     */
    @Override
    public void move() {
        final double conversionFactor = Math.PI / 180;
        posX += max(speed * Math.cos(direction * conversionFactor), MAXSPEED);
        posY += max(speed * Math.sin(direction * conversionFactor), MAXSPEED);
    }

    /**
     * resets animal hunger.
     */
    @Override
    public void eat() {
        hunger = 0;
    }

    /**
     * resets animal fatigue.
     */
    @Override
    public void sleep() {
        fatigue = 0;
    }

    /**
     * turns the animal's movement direction (in degrees).
     *
     * @param degrees degrees to rotate the animal's direction
     * (counterclockwise)
     */
    @Override
    public void turn(int degrees) {
        direction += degrees;
        direction %= 360;
    }

    /**
     * rotate the animal's movement direction 90 degrees
     */
    public void turn() {
        direction += 90;
        direction %= 360;
    }

    /**
     * (
     * places the animal on the x and y position specified
     *
     * @param x the x position to place the animal.
     * @param y the y position to place the animal.
     */
    @Override
    public void place(int x, int y) {
        posX = x;
        posY = y;
    }
}
