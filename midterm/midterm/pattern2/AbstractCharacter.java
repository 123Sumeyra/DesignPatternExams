package midterm.pattern2;

public abstract class AbstractCharacter {
    private IWeaponBehavior weapon;
    //protected IWeaponBehavior Weapon;


    public AbstractCharacter(IWeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void Display();


    public Object Fight() {

         return weapon.UseGun();
    }
}