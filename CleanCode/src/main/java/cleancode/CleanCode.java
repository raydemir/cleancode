package cleancode;

import cleancode.human.CraftsmanHuman;
import cleancode.human.WarriorHuman;
import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;

public class CleanCode {

    public static void main(String[] args) {

        CraftsmanHuman craftsmanHuman = new CraftsmanHuman("Craftsman");

        craftsmanHuman.craftWeapon(WeaponType.RIFFLE);

        Weapon weapon = craftsmanHuman.getWeapon();

        WarriorHuman warriorHuman = new WarriorHuman("Warrior", weapon);

        warriorHuman.useWeapon();
    }
}
