package examples.practice;

public class TestDemo {
    public static void userMain() {
        Operator operator = new Operator("Test 1", 1, 2000);
        Analyst analyst = new Analyst("Test 2", 2, 5000);
        Manager manager = new Manager("Test 3", 3, 7000);

        BonusControl bonusControl = new BonusControl();

        bonusControl.register(operator);
        bonusControl.register(analyst);
        bonusControl.register(manager);

        System.out.println(bonusControl.getTotalBonus());
    }
}
