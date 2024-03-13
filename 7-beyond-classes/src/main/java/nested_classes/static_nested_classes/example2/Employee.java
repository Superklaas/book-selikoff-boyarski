package nested_classes.static_nested_classes.example2;

public class Employee {

    private static final int MONTHS_PER_YEAR = 13;

    private final int salary;
    private final BonusCalculator bonusCalculator;

    public Employee(int salary, int bonus) {
        this.salary = salary;
        this.bonusCalculator = new BonusCalculator(bonus);
    }

    public int getYearlyBonusPay() {
        return bonusCalculator.getYearlyBonusPay(salary);
    }

    private static class BonusCalculator {

        private final int bonus;

        private BonusCalculator(int bonus) {
            this.bonus = bonus;
        }

        private int getYearlyBonusPay(int salary) {
            return (salary + bonus)/MONTHS_PER_YEAR;
        }

    }

}
