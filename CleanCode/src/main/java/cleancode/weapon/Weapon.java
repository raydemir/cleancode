package cleancode.weapon;

public class Weapon {

    private String name;
    private WeaponType type;

    public Weapon(String name, WeaponType type) {
        this.name = name;
        this.type = type;
    }

    public WeaponType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
