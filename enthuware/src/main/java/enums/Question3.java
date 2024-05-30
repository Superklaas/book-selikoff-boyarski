package enums;

import java.util.TreeSet;

public class Question3 {

    public static void main(String[] args) {
        var ts = new TreeSet<Title>();
        ts.add(Title.MS2);
        ts.add(Title.MR);
        ts.add(Title.MS1);
        for(Title t :  ts){
            System.out.println(t);
        }
    }

}

enum Title {
    MR("Mr."), MS1("Ms."), MS2("Ms.");
    private String title;
    private Title(String s) {
        title = s;
    }
}
