package clients;

public class Bat extends Animal {

    public Bat(String name) {
        super(name);
    }

    @Override
    public int fly() {
        System.out.println("Животное хорошо летает!");
        return 50;
    }

}
