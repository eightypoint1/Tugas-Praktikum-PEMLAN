public class Hero {
    private String name;
    private Weapon Sword;
    private Health HP;

    Hero() {}
    
    Hero(String name) {
        this.name = name;
    }

    Hero(String name, Weapon Sword, int HP) {
        this.name = name;
        this.Sword = Sword; // Aggregation
        this.HP = new Health(200); // Composition
    }

    public String getName() {
        return name;
    }

    public Weapon getSword() {
        return Sword;
    }

    public Health getHealth() {
        return HP;
    }

    public void setHealth(int HP) { // Composition
        this.HP = new Health(HP);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSword(Weapon Sword) { // Aggregation
        this.Sword = Sword;
    }

    public void seeStatus() {
        System.out.println("Name: " + name);
        System.out.println("Sword: " + Sword.getName());
        System.out.println("HP: " + HP.getHealth());
    }

    public void heroTarung(Hero hero1, Hero hero2) {
        System.out.println(hero1.getName() + " Melawan " + hero2.getName() + ", dan melakukan damage sebanyak " + hero1.Sword.getDamage());
        hero2.HP.reduceHealth(hero1.Sword);
    }
}
