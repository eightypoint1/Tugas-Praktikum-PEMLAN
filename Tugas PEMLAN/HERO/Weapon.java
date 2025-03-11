public class Weapon {
    private String name;
    private int damage;

    Weapon() {}

    Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName(){
        return name;
    }

    public int getDamage(){
        return damage;
    }
}
