package midterm.pattern2;

public class SwordBehavior implements IWeaponBehavior {
    @Override
    public void Display() {
        System.out.println("sword");
    }

    @Override
    public String UseGun() {
        return ("You are slashing .");

    }
}
