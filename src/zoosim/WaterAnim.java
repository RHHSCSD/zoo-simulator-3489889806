/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author jonat
 */
public class WaterAnim extends Animal implements ISwimmable {

    boolean canBreathe;

    /**
     *
     * @param name name of the animal.
     * @param species species of the animal.
     * @param x x position of the animal
     * @param y y position of the animal
     */
    public WaterAnim(String name, String species, int x, int y) {
        super(name, species, x, y);
    }

    /**
     * make the aquatic animal surface, prevents it from breathing.
     */
    @Override
    public void surface() {
        canBreathe = false;
    }

    /**
     *
     * @return if the aquatic animal can breathe.
     */
    @Override
    public boolean canSurface() {
        return canBreathe;
    }

}
