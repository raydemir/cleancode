package cleancode;

import cleancode.human.Human;
import cleancode.human.HumanFactory;
import cleancode.human.craftsman.CraftsmanFactory;
import cleancode.human.warrior.WarriorFactory;
import cleancode.weapon.Knife;
import cleancode.weapon.Sword;

public class CleanCode {

    public static void main(String[] args) {

        HumanFactory craftsmanFactory = new CraftsmanFactory();
        Human craftsman = craftsmanFactory.createHuman(new Knife());
        craftsman.attack();
        craftsman.eat();

        HumanFactory warriorFactory = new WarriorFactory();
        Human warrior = warriorFactory.createHuman(new Sword());
        warrior.attack();
        warrior.sleep();
    }
}
