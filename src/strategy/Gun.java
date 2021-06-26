package strategy;

public class Gun implements Weapon{

    @Override
    public void attack() {
        System.out.println("Attack with Gun!!");
    }
}
