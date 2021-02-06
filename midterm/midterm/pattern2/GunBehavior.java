package midterm.pattern2;

public class GunBehavior implements IWeaponBehavior {
    @Override
    public void Display() {

        System.out.println("Gun");
    }

    @Override
    public String UseGun() {
        return ("You are shooting .");

    }
}
