public class Medic extends Hero {
    private double healPoint;

    public Medic(int health, int damage, double healPoint, String typeAbility) {
        super(health, damage, typeAbility);
        this.healPoint = healPoint;
    }

    @Override
    public void applySuperAbility() {
        System.out.println(
                "Medic �������� ����������� " + getTypeAbility()
        );


    }

    public String increaseExperience() {
        double tenPercent = (((10 * healPoint) / 100) + healPoint);
        return "Heal Points: " + healPoint + " ���������� �� 10% �����: " + tenPercent;
    }

    @Override
    public String info() {
        return super.info();
    }
}
