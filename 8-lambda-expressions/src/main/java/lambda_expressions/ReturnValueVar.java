package lambda_expressions;

import java.util.function.UnaryOperator;

public class ReturnValueVar {

    public static void main(String[] args) {

         UnaryOperator<Integer> multiplyByTwo = integer -> integer * 2;
//        var multiplyByTwo = integer -> integer * 2;

        Integer result = multiplyByTwo.apply(2);
        System.out.println(result);


    }

}
