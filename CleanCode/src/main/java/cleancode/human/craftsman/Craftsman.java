package cleancode.human.craftsman;

import cleancode.human.Human;
import cleancode.weapon.Weapon;

public class Craftsman implements Human {

    private Weapon weapon;

    @Override
    public void attack() {
        System.out.println("Craftsman attacks with " + weapon.getName());
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void eat() {
        System.out.println("Craftsman is eating");
    }

    public void sleep() {
        System.out.println("Craftsman is sleeping");
    }
}