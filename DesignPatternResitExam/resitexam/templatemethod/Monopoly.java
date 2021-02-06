package resitexam.templatemethod;


public class Monopoly extends Game {

    @Override
    protected void initializeGame() {

        System.out.println("Monopoly Game started");
    }

    @Override
    protected void makeMove(int player) {
        System.out.println(player + " is playing");

    }

    @Override
    protected boolean gameEnded() {
        while (i < 9 ){
            i++;
            return false;
        }

        return true;

    }

    @Override
    protected void printWinner() {
        System.out.println("winner is  Sumeyra" );

    }
}