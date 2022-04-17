package password.generator;

import java.util.Random;

public class RandomNum {

    private static int NumberRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than Min");
        }
            Random rand = new Random();
            return rand.nextInt((max - min) + 1) + min;
    }


}