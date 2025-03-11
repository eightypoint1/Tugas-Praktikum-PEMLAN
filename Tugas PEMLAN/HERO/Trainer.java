public class Trainer {
    private String name;
    
    Trainer() {

    }

    Trainer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void melatihHero(Hero Hero) { // Association
        System.out.println(name + " Melatih " + Hero.getName());
    }
}
