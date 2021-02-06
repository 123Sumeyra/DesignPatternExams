package midterm.pattern2;

public class Fighter extends AbstractCharacter {
    public Fighter(IWeaponBehavior weapon){
        super(weapon);
    }

    @Override
    public void Display() {
        System.out.println("You are Fighter.");
    }
}
