package midterm.pattern2;

public class Knight extends AbstractCharacter {
    public Knight(IWeaponBehavior weapon){

        super(weapon);
    }

    @Override
    public void Display() {

        System.out.println("You are Knight");
    }
}
