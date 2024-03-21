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

    @Override
    /**
     * makes the avian fly.
     */
    public void fly() {
        canFly = true;
    }

    @Override
    /**
     * makes the avian land.
     */
    public void land() {
        canFly = false;
    }

    @Override
    /**
     * @return if the avian is airborne
     */
    public boolean isFlying() {
        return canFly;
    }

}
