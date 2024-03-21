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

    @Override
    public void surface() {
        canBreathe = false;
    }

    @Override
    public boolean canSurface() {
        return canBreathe;
    }

}
