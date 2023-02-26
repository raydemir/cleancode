package cleancode.weapon;

public class Knife implements Weapon {

    @Override
    public Weapon createWeapon() {
        return new Knife();
    }

    @Override
    public String getName() {
        return WeaponType.KNIFE.getName();
    }
}