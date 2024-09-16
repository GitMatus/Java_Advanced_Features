package advanced_coding.Example3;

public class Player implements Oponent, PlayerBehavior{

    private final String name;
    private final Weapon weapon;
    private int health;

    public Player(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        this.health = 3;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void hit(int damage) {
        health-=damage;
    }

    @Override
    public void loadWeapon() {
        weapon.loadBullet();
    }

    @Override
    public void shot(Oponent oponent) {
        oponent.hit(weapon.shot());
    }

    @Override
    public Integer getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getStatus() {
        return getName() + ", " + getHealth() + ", " + weapon.actualMagazineSize();
    }
}
