package Game;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("s1mple");
        Player player2 = new Player("ZywOo");

        System.out.println("Match starts");

        player1.scoreForT();

        player2.scoreForCT();

        player1.scoreForT();

        System.out.println("Final score");

        MatchState finalSession = MatchState.getInstance();
        finalSession.showCurrentScore();
    }
}
