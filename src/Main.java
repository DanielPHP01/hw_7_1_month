public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(200, 50, " ����� ");
        Warrior warrior = new Warrior(300, 20, " ����������� ���� ");
        Medic medic = new Medic(100, 5, 20, " ����� ������� ");
        Hero[] heroes = {medic, warrior, magic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            System.out.println(heroes[i].info());
            if (heroes[i] == medic) {
                System.out.println(medic.increaseExperience());
            }

        }
    }
}