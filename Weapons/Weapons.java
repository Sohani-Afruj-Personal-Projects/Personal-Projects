
interface Lethality {
    void lethal();
}

public abstract class Weapons {

    void recoil() {
        System.out.println("\n" + "The Weapon has Produced Kickback.");
    }

    abstract void attack();

}
