package e2.solutions4;

public class Exercise09 {
    public static void main(String[] args) {
        GameModel a = GameModel.instance();
        GameModel b = GameModel.instance();
        System.out.println("a == b ? " + (a == b));
        a.newGame();
        System.out.println("Da xao bai xong");
    }
}