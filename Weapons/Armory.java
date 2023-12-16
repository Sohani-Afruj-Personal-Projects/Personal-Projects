public class Armory {

    /*
     * I know this is not the best-looking code and that the upperCase has been
     * everywhere, but it runs.
     * I am terribly short on time but will implement User Interface after exams and
     * expand on this project.
     * I have so many ideas for expansion.
     */

    public static void main(String args[]) {

        Bow bow = new Bow();
        Crossbow CB = new Crossbow();
        GrenadeLauncher GL = new GrenadeLauncher();
        Flamethrower FT = new Flamethrower();

        System.out.println("\n Caution. Weapon Testing has Begun.");

        // Bow
        System.out.print("\n --- Bow ---");
        bow.recoil();
        bow.attack();
        bow.arrow();
        bow.fingerTab();
        bow.lethal();

        // Crossbow
        System.out.print("\n --- Crossbow ---");
        CB.recoil();
        CB.attack();
        CB.scope();
        CB.stringSilencer();
        CB.arrow();
        CB.fingerTab();
        CB.lethal();

        // Grenade Launcher
        System.out.print("\n --- Grenade Launcher --- ");
        GL.recoil();
        GL.attack();
        GL.reload();
        GL.mount();
        GL.lethal();

        // Flamethrower
        System.out.print("\n --- Flamethrower ---");
        FT.recoil();
        FT.attack();
        FT.refuel();
        FT.clean();
        FT.lethal();
    }
}

