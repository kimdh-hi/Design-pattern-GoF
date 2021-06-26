package strategy;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.setWeapon(new Knife());
        game.attack();

    }
}
