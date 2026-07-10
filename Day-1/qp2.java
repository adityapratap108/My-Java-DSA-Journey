import java.util.Scanner;

public class qp2 {
    public static void main(String[] args) {
        System.out.println("==== This Program takes user input to print some operations num1 and num2 ====");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter first number:");
        int num1 = sc.nextInt();

        System.out.print("Please Enter second number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.print("Sum is: ");
        System.out.print(sum);

        int pdt = num1 * num2;
        System.out.print("\nProduct is: ");
        System.out.print(pdt);

        double div = (double) num1 / (double) num2;
        System.out.print("\nDivision is: ");
        System.out.print(div);

        float modulus = num1 % num2;
        System.out.print("\nRemainder is: ");
        System.out.print(modulus);
    }
}
