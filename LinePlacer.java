package Assignemnt4;

import javax.swing.*;
import java.util.Arrays;

public class LinePlacer {
    public static void rows(String nrRows, int input){

        String row, finalRow;
        int count;
        row = "Row ";
        finalRow = "";

        for (count = 1; count < input+1; count++) {
            if (count == 1) {
                finalRow = row + String.valueOf(count) + " - " + Arrays.toString(RandomGenerator.lineGenerator());
                JOptionPane.showMessageDialog(null, finalRow);
            }
            else {
                finalRow = finalRow + " \n" + row + String.valueOf(count) + " - " + Arrays.toString(RandomGenerator.lineGenerator());
            }
        }
        JOptionPane.showMessageDialog(null,finalRow);
    }
}
