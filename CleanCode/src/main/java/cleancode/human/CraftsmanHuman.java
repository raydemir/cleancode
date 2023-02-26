package cleancode.human;

import cleancode.human.Human;
import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;

public class CraftsmanHuman extends Human {

    private String weaponName;

    public CraftsmanHuman(String humanName) {
        super(humanName, null);
    }

    @Override
    public void useWeapon() {
        if (getWeapon() != null) {
            System.out.println(getHumanName() + " is using " + getWeapon().getName());
        } else {
            System.out.println(getHumanName() + " has no weapon to use!");
        }
    }

    @Override
    public void craftWeapon(WeaponType type) {
        switch (type) {
            case KNIFE:
                weaponName = "Knife";
                break;
            case RIFFLE:
                weaponName = "Riffle";
                break;
            case SWORD:
                weaponName = "Sword";
                break;
            default:
                weaponName = "Undefined";
                break;
        }

        setWeapon(new Weapon(weaponName, type));
        System.out.println(weaponName + " is created by " + getHumanName());
    }
}
