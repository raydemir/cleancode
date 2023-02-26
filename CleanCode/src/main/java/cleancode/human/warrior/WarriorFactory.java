package cleancode.human.warrior;

import cleancode.human.Human;
import cleancode.human.HumanFactory;
import cleancode.weapon.Weapon;

public class WarriorFactory implements HumanFactory {

    @Override
    public Human createHuman(Weapon weapon) {
        weapon.createWeapon();
        Warrior warrior = new Warrior();
        warrior.setWeapon(weapon);
        return warrior;
    }
}