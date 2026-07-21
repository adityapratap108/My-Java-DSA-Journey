import java.util.Scanner;

public class practiceProblemOne {

    /* Declared and Initialized */
    public static void printHW() {
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        return;
    }

    /* Function with parameters */
    public static void printHW_N_times(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Hellow World");
        }
    }

    public static void main(String[] args) {

        // printHW(); // function called

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number of times hellow world should be printed:");

        int n = inp.nextInt();
        printHW_N_times(n);
    }
}
