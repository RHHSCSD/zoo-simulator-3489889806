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

    /**
     * rotates the direction of the object
     *
     * @param degrees degrees to rotate the object (counter clockwise)
     */
    @Override
    public void turn(int degrees) {
        direction += degrees;
        degrees %= 360;
    }

    /**
     * sets the object down
     *
     * @param x x position to set the object at
     * @param y y position to set the object at
     */
    @Override

    public void place(int x, int y) {
        posX = x;
        posY = y;
    }
}
