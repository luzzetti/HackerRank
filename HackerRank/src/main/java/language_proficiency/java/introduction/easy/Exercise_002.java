package language_proficiency.java.introduction.easy;

import java.util.Scanner;

/*
 * Hackerrank
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
 * 
 */

public class Exercise_002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        
        scan.close();
    }

}
