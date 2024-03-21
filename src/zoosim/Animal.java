package zoosim;

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

    /**
     * moves animal one time step.
     */
    public void move() {
        posX += speed * Math.cos(direction);
        posY += speed * Math.sin(direction);
    }

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

    /**
     * turns the animal's movement direction (in radians).
     *
     * @param radians
     */
    public void turn(double radians) {
        direction += radians;
    }

    @Override
    public void turn() {
        direction += Math.pi / 4;
    }

    @Override
    public void place(int x, int y) {
        posX = x;
        posY = y;
    }
}
