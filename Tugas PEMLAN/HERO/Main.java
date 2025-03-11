public class Main {
    public static void main(String[] args) {

        Weapon Pedang1 = new Weapon("pedang1", 10);
        Weapon Pedang2 = new Weapon("pedang2", 20);
        Hero hero1 = new Hero("Hero1", Pedang1, 200);
        Hero hero2 = new Hero("Hero2");
        Trainer trainer1 = new Trainer("trainer1");

        hero1.seeStatus();
        trainer1.melatihHero(hero1);

        hero2.setHealth(150);
        hero2.setSword(Pedang2);
        hero2.seeStatus();

        hero1.heroTarung(hero1, hero2);
        hero2.seeStatus();

    }
}
