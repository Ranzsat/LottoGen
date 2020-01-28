package Assignemnt4;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {
    //Generator for a random number
    public static int numberGenerator(int min, int max){
        int generator = ThreadLocalRandom.current().nextInt(min, max) +1;
        return generator;
    }
    public static String[] lineGenerator()   {
        String[] stringArray = new String[8];
        System.out.println(stringArray.length);
        int number;
        String numberControl;
        for (int i = 0; i <= 7; i++) {

            boolean contains = false;
            //Calling the number generator for a number between 1-35
            number = numberGenerator(0, 34);
            numberControl = Integer.toString(number);
            stringArray[i] = numberControl;

            //Checks if the generated number already exists
            if (stringArray[i].contains(numberControl)){
                number = numberGenerator(0,34);
                numberControl = Integer.toString(number);
                contains = true;
            }
            if (!contains == true){
                stringArray[i] = numberControl;
            }
        }
        return stringArray;
    }
}
