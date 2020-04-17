/**
 * This program will prompt the user to enter 10 scores
 * and will find the lowest and the highest score
 * the program will also find the average score
 */

import java.util.Scanner;
import java.util.Arrays;

public class TestScores {
    public static void main (String [] args ) {

        //Declare the variables
        Scanner in = new Scanner(System.in);
        int score[] = new int[10];
        int sum = 0;
        int lowest = 100;
        int highest = 0;

        //Prompt the user to enter the 10 scores
        //and sum them
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter a score (" + (i + 1) + "/10): ");
            score[i] = in.nextInt();
            sum += score[i];
        }
        System.out.println(" ");

        //find the highest score
        for (int i = 0; i < score.length; i++) {
            if (score[i] > highest)
                highest = score[i];
            }

        //find the lowest score
        for (int j = 0; j < score.length; j++) {
            if (score[j] < lowest)
                lowest = score[j];
        }

        //display the result
        System.out.println("The Highest score is: " + highest);
        System.out.println("The lowest score is: " + lowest);
        System.out.println("The average score is: " + (sum / 10));
        System.out.println("All the score are: " + Arrays.toString(score));
    }
}