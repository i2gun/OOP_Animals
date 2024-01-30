package clients;

public class Swan extends Animal {

    public Swan(String name) {
        super(name);
    }

    @Override
    public int fly() {
        System.out.println("Животное быстро летает!");
        return 100;
    }

    @Override
    public int toGo() {
        System.out.println("Животное медленно ходит!");
        return 5;
    }

    @Override
    public int swim() {
        System.out.println("Животное медленно плавает!");
        return 10;
    }

}
