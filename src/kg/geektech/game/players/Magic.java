package kg.geektech.game.players;


import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            int randDamageBoost = RPG_Game.random.nextInt(5);
            heroes[i].setDamage(heroes[i].getDamage() + randDamageBoost);
            System.out.println("Урон увеличен на: " + randDamageBoost + "   Полный урон: " + heroes[i].getDamage());
        }
    }
}
