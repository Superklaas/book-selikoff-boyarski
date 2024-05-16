package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question2 {

    public static void main(String[] args) {
        LocalDateTime pi = LocalDateTime.of(2022, 3, 14, 1, 59);
        var formatter = DateTimeFormatter.ofPattern("M.ddhhmm");
        System.out.println(formatter.format(pi));
    }

}
