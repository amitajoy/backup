package abc.def;

import java.util.stream.IntStream;

public interface InJava9 {

    //make sum private
    private int sum(int[] numbers) {
        return IntStream.of(numbers).sum();
    }

    //default impl -> java 8
    default boolean evenSum(int... numbers) {
        return sum(numbers) % 2 == 0;
    }

    default boolean oddSum(int... numbers) {
        return sum(numbers) % 2 == 1;
    }

}
