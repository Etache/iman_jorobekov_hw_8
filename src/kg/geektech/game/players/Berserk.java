package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int randRevert = RPG_Game.random.nextInt(4);
        int revertDamage = boss.getDamage() * (randRevert * 10) / 100;
        this.setDamage(this.getDamage() + revertDamage);
    }
}
