package abc.def;

import java.util.stream.IntStream;

public interface InJava8 {

    //default impl -> java 8
    default boolean evenSum(int... numbers) {
        return sum(numbers) % 2 == 0;
    }

    default boolean oddSum(int... numbers) {
        return sum(numbers) % 2 == 1;
    }

    // we don't want this to be public;
    // but how else do we resuse?
    default int sum(int[] numbers) {
        return IntStream.of(numbers).sum();
    }

}