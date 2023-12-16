public class GrenadeLauncher extends Weapons implements Lethality {

    public GrenadeLauncher()   {
        super();
    }

    public void reload() {
        System.out.println("The Grenade Launcher has been Reloaded.");
    }

    public void mount() {
        System.out.println("The Grenade Launcher had been Mounted and is in Position.");
    }



    @Override
    public void attack()    {
        System.out.println("BOOM");
    }

    @Override
    public void lethal() {
        System.out.println("This is Not the Most Lethal Weapon out of the Test Run.");
    }
}
    

