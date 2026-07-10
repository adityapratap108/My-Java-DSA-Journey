import java.util.Scanner;

public class qp3 {
    public static void main(String[] args) {
        System.out.println("==== This program prints the area if a circle ====");

        float PI = 3.14f;
        float radius;
        float area;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        radius = sc.nextFloat();

        area = PI * radius * radius;

        System.out.print("Area of Circle is: ");
        System.out.print(area);
    }
}
