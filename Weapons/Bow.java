
public class Bow extends Weapons implements Lethality{
    public Bow()   {
        super();
    }

    public void arrow() {
        System.out.println("An Arrow has been Positioned on the Bow.");
    }

    public void fingerTab() {
        System.out.println("The Archer has Put on a Finger Tab to Protect Their Fingers.");
    }



    @Override
    public void attack()    {
        System.out.println("FSSSSS");
    }

    @Override
    public void lethal() {
        System.out.println("This is Not the Most Lethal Weapon out of the Test Run.");
    }
}
