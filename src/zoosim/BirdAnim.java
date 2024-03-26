/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author jonat
 */
public class BirdAnim extends Animal implements IFlyable {

    boolean canFly;

    /**
     *
     * @param name name of the animal.
     * @param species species of the animal.
     * @param x x position of the animal.
     * @param y y position of the animal.
     */
    public BirdAnim(String name, String species, int x, int y) {
        super(name, species, x, y);
    }

    /**
     * makes the avian fly.
     */
    @Override
    public void fly() {
        canFly = true;
    }

    /**
     * makes the avian land.
     */
    @Override
    public void land() {
        canFly = false;
    }

    /**
     * @return if the avian is airborne
     */
    @Override

    public boolean isFlying() {
        return canFly;
    }

}
