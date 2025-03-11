public class Health {
    private int health;

    Health() {}

    Health(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(Weapon Weapon) {
        health -= Weapon.getDamage();
    }
}