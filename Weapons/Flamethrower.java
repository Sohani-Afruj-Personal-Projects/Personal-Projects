
public class Flamethrower extends Weapons implements Lethality {

    public Flamethrower() {
        super();
    }

    public void refuel() {
        System.out.println("The Flamethrower has been Refuelled with Gel");
    }

    public void clean() {
        System.out.println("the Flamethrower has been Cleaned.");
    }

    @Override
    public void attack() {
        System.out.println("PSSSCCCCHH");
    }

    @Override
    public void lethal() {
        System.out.println("The Flamethrower is the Most Lethal Weapon out of the Test Run.");
    }
}
