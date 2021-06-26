package strategy;

public class Game {

    private Weapon weapon;

    public Game() {}

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // delegate
    // 구현은  다른 클래스에게 위임
    public void attack() {
        if (this.weapon == null) {
            System.out.println("무기 없음");
        }
        this.weapon.attack();
    }
}
