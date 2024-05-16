package chapter4;

import java.io.IOException;

public class Question3 {
    public static void think() throws IOException {
        try {
//            throw new Exception();
        } catch (RuntimeException r) {}               
    }
    public static void main(String[] ideas) throws Exception {
        think();
    } }


