import java.util.Scanner;

public class inputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // It will take input until the user presses space
        System.out.println(input);

        String name = sc.nextLine(); // It will take input until user presses Enter
                                     // btn and goes on to the new line
        System.out.println(name);

        int num = sc.nextInt();
        System.out.println(num);

        float PI = sc.nextFloat();
        System.out.println(PI);

        short sh = sc.nextShort();
        System.out.println(sh);

        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        long lo = sc.nextLong();
        System.out.println(lo);
    }
}
