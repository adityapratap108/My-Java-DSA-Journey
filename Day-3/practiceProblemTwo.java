import java.util.Scanner;

public class practiceProblemTwo {

    public static float sumOfTwoNums(float num1, float num2) {
        float sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        float n1 = inp.nextFloat();
        System.out.println();
        System.out.print("Enter Second Number: ");
        float n2 = inp.nextFloat();
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Sum of " + n1 + " and " + n2 + " is: " + sumOfTwoNums(n1, n2));
    }
}
