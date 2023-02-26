package cleancode.human;

import cleancode.weapon.Weapon;

public interface HumanFactory {
    Human createHuman(Weapon weapon);
}