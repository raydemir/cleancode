package cleancode.human;

import cleancode.weapon.Weapon;

public interface Human {

    void eat();

    void sleep();

    void attack();

    void setWeapon(Weapon weapon);
}
