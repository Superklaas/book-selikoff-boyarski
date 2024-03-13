package nested_classes.static_nested_classes.example1;

public class Employee {

    private final int salary;
    private static final int MONTHS_PER_YEAR = 13;

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getYearlySalary() {
        return salary * MONTHS_PER_YEAR;
    }

    public static class BonusCalculator {

        private final Employee employee;

        public BonusCalculator(Employee employee) {
            this.employee = employee;
        }

        public int getYearlyBonusPay(int bonus) {
            return (employee.salary + bonus) / MONTHS_PER_YEAR;
        }

    }

}
