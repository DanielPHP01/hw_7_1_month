public class Magic extends Hero {
    public Magic(int health, int damage, String typeAbility) {
        super(health, damage, typeAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println(
                "Magic применил способность " + getTypeAbility()
        );


    }

    @Override
    public String info() {
        return super.info();
    }
}
