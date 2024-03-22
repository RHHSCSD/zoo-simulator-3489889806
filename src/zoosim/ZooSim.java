/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author michael.roy-diclemen
 */
/*
    to add predator/prey interactions,
    each animal would have a different value of max health, Strength and nimbleness.
    each will also have a list storing injuries.
    maximum health represents how strong or sturdy an animal is. Normal health would likely be at 80 or 90% of max.
    This health number will vary depending on how fatigued and hungry it is. It will decrease if the animal is attacked.
    strength and nimblesness are proportional to health.
    The healthier it is, the faster the animal willflee, or the stronger it will be.

    Carnivores and omnivores will attack other animals depending on the health of itself, and health  or strength of other,
as well as its current hunger. When it is hungry enough or the strength disparity is high enough, it will attack.
    Animals will attempt to flee when a combination of strength, health and fatigue are low enough.
    The chance of success of fleeing is based in nimblesness and injuries of escapee and the other animal.
    Omnivores will prefer other food sources before attacking other animals.
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
