/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author jonat
 */
public class Object implements IObject {

    String type;
    double posX;
    double posY;
    String size;
    double direction;

    @Override
    /**
     * rotates(?) the object???
     */
    public void turn(int degrees) {
        direction += degrees;
        degrees %= 360;
    }

    @Override
    /**
     * sets the object down.
     */
    public void place(int x, int y) {
        posX = x;
        posY = y;
    }
}
