package polymorphism.override;

public class Main {

    public static void main(String[] args) {

        Penguin emperorPenguin1 = new EmperorPenguin();
        emperorPenguin1.printInfo();

        EmperorPenguin emperorPenguin2 = new EmperorPenguin();
        emperorPenguin2.printInfoSuper();

    }

}

class Penguin {

    int getHeight() {
        return 3;
    }

    void printInfo() {
        System.out.println(this.getHeight());
    }

}

class EmperorPenguin extends Penguin {

    @Override
    int getHeight() {
        return 8;
    }

    void printInfoSuper() {
        System.out.println(super.getHeight());
    }

}