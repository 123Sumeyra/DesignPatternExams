package midterm.pattern2;

public class Queen extends AbstractCharacter {
    public Queen(IWeaponBehavior weapon){
        super(weapon);
    }

    @Override
    public void Display() {

        System.out.println("You are Queen");
    }
}
