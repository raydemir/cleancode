package cleancode.weapon;

public class Riffle implements Weapon {

    @Override
    public Weapon createWeapon() {
        return new Riffle();
    }

    @Override
    public String getName() {
        return WeaponType.RIFFLE.getName();
    }
}