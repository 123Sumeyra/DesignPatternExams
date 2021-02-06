package midterm.pattern2;

public class StrategyPatternDemo {
    public static void main(String[] args){
        AbstractCharacter character = new Queen(new SwordBehavior());
        character.Display();
        System.out.println(character.Fight());
        character.Fight();

    }
}
