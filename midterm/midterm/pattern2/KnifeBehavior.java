package midterm.pattern2;

public class KnifeBehavior implements IWeaponBehavior {
    @Override
    public void Display() {
        System.out.println("knife");
    }

    @Override
    public String UseGun() {
        return  ("You are stabbing.");

    }
}
