package clinic.client.patient;

import clinic.client.patalogy.Illness;

import java.time.LocalDate;

public class Animal {

    // protected видно в классе и во всех наследниках
    protected String nickName;
    protected LocalDate birthDate;
    protected Illness illness;

    // Это пустой конструктор (по умолчанию)
    public Animal(String nickName, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal(String nickName) {
        super();
        this.nickName = nickName;
    }

    public Animal() {
        this("Кличка", LocalDate.now(), new Illness("Болеет"));
    }

    public String getNickName() {
        return nickName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCycle() {
        wakeUp("11:00");
        hunt();
        eat();
        sleep();
    }

    private void wakeUp() {
        wakeUp("12:00");
    }

    private void wakeUp(String time) {
        System.out.println("Животное " + nickName + " проснулось в " + time);
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    private void hunt() {
        System.out.println("Животное охотится!");
    }

    private void eat() {
        System.out.println("Животное ест!");
    }

    private void sleep() {
        System.out.println("Животное уснуло!");
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, illness = %s", nickName, birthDate, illness);
    }
}