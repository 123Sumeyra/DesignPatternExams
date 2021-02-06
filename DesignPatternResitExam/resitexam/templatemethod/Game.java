package resitexam.templatemethod;

abstract class Game {

    protected int playersCount;
    protected int i;

    final void playGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!gameEnded()) {
            makeMove(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }

    protected  abstract void initializeGame();

    protected abstract void makeMove(int player);

    protected abstract boolean gameEnded();

    protected abstract void printWinner();



}

