package cleancode.weapon;

public class Sword implements Weapon {

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public String getName() {
        return WeaponType.SWORD.getName();
    }
}