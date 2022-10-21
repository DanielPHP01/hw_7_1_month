public class Warrior extends Hero {
    public Warrior(int health, int damage, String typeAbility) {
        super(health, damage, typeAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println(
                "Warrior применил способность " + getTypeAbility()
        );

    }

    @Override
    public String info() {
        return super.info();
    }

}

