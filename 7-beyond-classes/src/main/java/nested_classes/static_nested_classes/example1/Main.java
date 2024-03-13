package nested_classes.static_nested_classes.example1;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(2000);
        Employee.BonusCalculator bonusCalculator = new Employee.BonusCalculator(employee);
        int yearlyBonusPay = bonusCalculator.getYearlyBonusPay(250);
        System.out.println(yearlyBonusPay);
        System.out.println(employee.getYearlySalary());
    }

}
