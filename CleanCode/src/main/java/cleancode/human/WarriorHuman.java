package cleancode.human;

import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;

public class WarriorHuman extends Human {

    public WarriorHuman(String humanName, Weapon weapon) {
        super(humanName, weapon);
    }

    private void printWeaponName() {
        System.out.println(getWeapon().getName());
    }

    @Override
    public void useWeapon() {
        WeaponType type = getWeapon().getType();
        switch (type) {
            case KNIFE:
            case RIFFLE:
            case SWORD:
                System.out.println(getWeapon().getName() + " is used by " + getHumanName());
                break;
            default:
                System.out.println("Unknown weapon!");
                break;
        }
    }

    @Override
    public void craftWeapon(WeaponType type) {
        System.out.println("Crafting weapon is not supported by " + this.getClass().getSimpleName());
    }

}
