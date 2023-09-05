package ch08interface.leture;

public class C06polymorphism {
    public static void main(String[] args) {
        Hero o1 = new Hero();
        o1.seWeapon(new Gun());
        o1.attack();

        o1.seWeapon(new Bow());
        System.out.println("게임 종료");


    }
}

class Hero{
    private Weapon weapon;
    public void seWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void attack() {
        weapon.trigger();
    }
}

interface Weapon {
    void trigger();
}
class Gun implements Weapon {
    @Override
    public void trigger() {
        System.out.println("총을 쏩니다");
    }
}
class Bow implements Weapon {
    @Override
    public void trigger() {
        System.out.println("활을 쏩니다");
    }
}