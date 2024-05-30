package oop;

public class Question9 {

    public static void main(String[] args) {
        Super s1 = new Super();
        Sub s2 = new Sub();
        s1 = (Super) s2;
        s2 = (Sub) s1;
    }

}

class Super {}

class Sub extends Super {}
