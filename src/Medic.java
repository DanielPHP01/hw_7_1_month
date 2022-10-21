public class Medic extends Hero {
    private double healPoint;

    public Medic(int health, int damage, double healPoint, String typeAbility) {
        super(health, damage, typeAbility);
        this.healPoint = healPoint;
    }

    @Override
    public void applySuperAbility() {
        System.out.println(
                "Medic применил способность " + getTypeAbility()
        );


    }

    public String increaseExperience() {
        double tenPercent = (((10 * healPoint) / 100) + healPoint);
        return "Heal Points: " + healPoint + " увеличелся на 10% стало: " + tenPercent;
    }

    @Override
    public String info() {
        return super.info();
    }
}
