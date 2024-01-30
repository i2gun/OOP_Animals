package clients;

public class Dolphin extends Animal {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public int swim() {
        System.out.println("Животное быстро плавает!");
        return 40;
    }

}
