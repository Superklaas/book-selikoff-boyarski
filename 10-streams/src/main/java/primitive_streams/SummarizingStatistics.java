package primitive_streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummarizingStatistics {

    public static void main(String[] args) {

        IntSummaryStatistics statsElements = IntStream.rangeClosed(1, 10).summaryStatistics();
        System.out.println(statsElements);

        IntSummaryStatistics statsEmpty = IntStream.empty().summaryStatistics();
        System.out.println(statsEmpty);

    }

}
