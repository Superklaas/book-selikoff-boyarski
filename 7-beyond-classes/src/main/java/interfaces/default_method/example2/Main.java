package interfaces.default_method.example2;

public class Main {

    public static void main(String[] args) {
        ZooRenovation zooRenovation = new ZooRenovationImpl();
        zooRenovation.printStatus();
        System.out.println("Status: " + zooRenovation.status());
        System.out.println("Project name: " + ZooRenovation.projectName());
    }

}
