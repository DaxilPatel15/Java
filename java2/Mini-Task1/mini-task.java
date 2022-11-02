import java.util.Scanner;
import java.lang.Math;

public class MiniExercise1 {
    public static void main(String[] args) {
        Task1();
        Task2();
    }

    public static void Task1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("how many elements would you like to create?  ");
        int number = scan.nextInt();
        Object arr[] = new Object[number];
        for (int y = 0; y < number; y++) {
            System.out.print("Please enter number value " + (y + 1) + "here:");
            int x = scan.nextInt();
            if (x == 0 || x == 1) {
                //3(a)
                if (x == 0) {
                    boolean boolValue = false;
                    arr[y] = boolValue;
                } else {
                    boolean boolValue = true;
                    arr[y] = boolValue;
                }
                //3(b)
            } else if (x >= -128 && x <= 127) {
                byte b = (byte) x;
                arr[y] = b;
                //3(c)
            } else if (x >= -32768 && x <= 32767) {
                short s = (short) x;
                arr[y] = s;
                //3(d)
            } else if (x >= -2147483648 && x <= 2147483647) {
                int integer = (int) x;
                arr[y] = integer;
            } else {
                System.out.println("Error");
            }
        }
        System.out.println();
        System.out.println("Retreiving Elements from array");
        for (Object numbers : arr) {
            System.out.println(numbers);
        }
    }

    public static void Task2() {
        int[][] board = new int[10][10];

        for (int rw = 0; rw < board.length; rw++) {
            for (int cl = 0; cl < board[rw].length; cl++) {
                int new_rw = rw + 1;
                int new_cl = cl + 1;
                board[rw][cl] = new_rw * new_cl;
                System.out.print(board[rw][cl] + "\t");
            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("How many different types of questions would you like to Answer?");
        int number = scan.nextInt();
        float answer_crt  = 0;
        int answer_incrt = 0;
        float total_question = number;
        for (int d = 0; d < number; d++) {
            int number1 = (int) (Math.random() * 10+1);
            int number2 = (int) (Math.random() * 10+1);
            System.out.println("what is " + number1 + "*" + number2);
            int multi = scan.nextInt();
            int answer = board[number1-1][number2-1];
            if (multi == ans) {
                System.out.println("Correct :)");
                answer_crt+=1;

            } else {
                System.out.println("Incorrect :(" + "\n" + "Correct Answer: " + answer );
            }
        }
        System.out.println("End");
        float percentage = (answer_crt/total_question)*100);

        int rounded_percentage = Math.round(percentage);
        System.out.println("Your correct answer"+answer_crt+"out of"+total_question);
        System.out.println("That's the Percentage of "+rounded_percentage+"%");

    }

}
