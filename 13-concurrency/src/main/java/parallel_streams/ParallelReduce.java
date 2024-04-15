package parallel_streams;

import java.util.List;

public class ParallelReduce {

    public static void main(String[] args) {

        String result = List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("",
                        (s1, c) -> s1 + c,
                        (s2, s3) -> s2 + s3);

        System.out.println(result);

    }

}
