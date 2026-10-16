package e2.solutions4;

import e2.chapter4.Deck;

class GameModel {

    private static final GameModel INSTANCE = new GameModel();

    private final Deck aDeck = new Deck();

    private GameModel() {}

    public static GameModel instance() {
        return INSTANCE;
    }

    public void newGame() {
        aDeck.shuffle();
    }
}