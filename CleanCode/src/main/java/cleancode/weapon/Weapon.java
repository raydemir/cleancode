package cleancode.weapon;

/**
 * The Weapon interface represents a basic structure of a weapon that can be
 * used by a warrior.
 */
public interface Weapon {

    /**
     * The createWeapon method creates a new instance of a Weapon object.
     *
     * @return a new instance of a Weapon object
     */
    Weapon createWeapon();

    /**
     * Returns the name of the weapon.
     *
     * @return the name of the weapon as a string
     */
    String getName();

}