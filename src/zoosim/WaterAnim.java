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
