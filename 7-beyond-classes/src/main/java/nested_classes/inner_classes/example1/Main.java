package nested_classes.inner_classes.example1;

public class Main {

    public static void main(String[] args) {

        Home home = new Home("Hi");
        home.enterRoom();

        Home.Room bedroom = home.new Bedroom();
        bedroom.sayHi();

    }

}
