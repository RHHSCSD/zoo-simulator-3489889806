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
    public void fly() {
        canFly = true;
    }

    @Override
    public void land() {
        canFly = false;
    }

    @Override
    public boolean isFlying() {
        return canFly;
    }

}
