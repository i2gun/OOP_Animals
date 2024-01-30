package clients;

public class Raccoon extends Animal {

    public Raccoon(String name) {
        super(name);
    }

    @Override
    public int toGo() {
        System.out.println("Животное медленно ходит!");
        return 10;
    }

    @Override
    public int swim() {
        System.out.println("Животное медленно плавает!");
        return 5;
    }

}
