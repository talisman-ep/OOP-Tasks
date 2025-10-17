package Game;

public class MatchState {
    private volatile static MatchState uniqueinstance;
    private int tScore = 0;
    private int ctScore = 0;

    private MatchState() {}

    //Реалізація патерну Singleton з використанням "double-chek locking"
    public static MatchState getInstance() {
        if (uniqueinstance == null) {
            synchronized (MatchState.class) {
                if (uniqueinstance == null) {
                    uniqueinstance = new MatchState();
                }
            }
        }
        return uniqueinstance;
        }

    public synchronized void tScore () {
        tScore++;
        printScore();
    }
    public synchronized void ctScore () {
        ctScore++;
        printScore();
    }

    private void printScore() {
        System.out.println("T Score: " + tScore);
        System.out.println("CT Score: " + ctScore);
    }

    public void showCurrentScore() {
        printScore();
    }
}
