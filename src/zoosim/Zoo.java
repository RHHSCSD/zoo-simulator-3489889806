/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class Zoo {

    ArrayList<Animal> animals;

    /**
     * adds animal to the zoo.
     *
     * @param a animal to add to the zoo
     */
    public void addAnimal(Animal a) {
        animals.add(a);
    }

    /**
     *
     * @return the statistics of the zoo, true if the zoo is running well, false
     * if not.
     */
    public boolean statistics() {
        return true;
    }

    /**
     * feeds hungry animals, replenishes all hunger for animals.
     */
    public void feedHungry() {
        for (Animal a : animals) {
            a.eat();
        }
    }

    /**
     * makes all animals sleep, replenishes fatigue.
     */
    public void sleep() {
        for (Animal a : animals) {
            a.sleep();
        }
    }

    /**
     * moves all animals towards their direction for one timestep.
     */
    public void move() {
        for (Animal a : animals) {
            a.move();
        }
    }
}
