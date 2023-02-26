package cleancode.human;

import cleancode.weapon.Weapon;
import cleancode.weapon.WeaponType;

public abstract class Human {

    private String humanName;
    private Weapon weapon;

    public Human(String humanName, Weapon weapon) {
        this.humanName = humanName;
        this.weapon = weapon;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void useWeapon();

    public abstract void craftWeapon(WeaponType type);

}
