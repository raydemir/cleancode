package cleancode.human.warrior;

import cleancode.human.Human;
import cleancode.weapon.Weapon;

public class Warrior implements Human {

    private Weapon weapon;

    @Override
    public void attack() {
        System.out.println("Warrior attacks with " + weapon.getName());
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void eat() {
        System.out.println("Warrior is eating");
    }

    public void sleep() {
        System.out.println("Warrior is sleeping");
    }
}