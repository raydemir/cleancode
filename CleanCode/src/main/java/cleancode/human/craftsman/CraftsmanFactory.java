package cleancode.human.craftsman;

import cleancode.human.Human;
import cleancode.human.HumanFactory;
import cleancode.weapon.Weapon;

public class CraftsmanFactory implements HumanFactory {

    @Override
    public Human createHuman(Weapon weapon) {
        weapon.createWeapon();
        Craftsman craftsman = new Craftsman();
        craftsman.setWeapon(weapon);
        return craftsman;
    }
}