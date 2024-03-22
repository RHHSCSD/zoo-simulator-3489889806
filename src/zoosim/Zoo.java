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

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public boolean statistics() {
        return true;
    }

    public void feedHungry() {
        for (Animal a : animals) {
            a.eat();
        }
    }

    public void sleep() {
        for (Animal a : animals) {
            a.sleep();
        }
    }

    public void move() {
        for (Animal a : animals) {
            a.move();
        }
    }
}
