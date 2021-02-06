package resitexam.templatemethod;

class Backgammon extends Game {


    @Override
    protected void initializeGame() {
        System.out.println("Backgammon Game started");

    }

    @Override
    protected void makeMove(int player) {
        System.out.println(player + " is playing");

    }

    @Override
    protected boolean gameEnded() {
        while (i < 6) {
            i++;

            return false;

        }
        return true;
    }

    @Override
    protected void printWinner() {
        System.out.println("winner is Summ" );


    }
}