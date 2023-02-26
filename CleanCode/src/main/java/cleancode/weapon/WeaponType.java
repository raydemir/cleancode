package cleancode.weapon;

public enum WeaponType {

    KNIFE("Knife"),

    SWORD("Sword"),

    RIFFLE("Riffle");

    public final String name;

    WeaponType(String weaponName) {
        this.name = weaponName;
    }

    public String getName() {
        return name;
    }
}
