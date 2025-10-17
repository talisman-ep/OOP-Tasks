package Game;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }
    public void scoreForT() {
        MatchState.getInstance().tScore();
    }
    public void scoreForCT() {
        MatchState.getInstance().ctScore();
    }
}
