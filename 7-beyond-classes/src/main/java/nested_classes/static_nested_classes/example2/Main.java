package nested_classes.static_nested_classes.example2;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(2000, 250);
        int yearlyBonusPay = employee.getYearlyBonusPay();
        System.out.println(yearlyBonusPay);
    }

}
