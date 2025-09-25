import java.util.Scanner;

public class exercises_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextInt();
        System.out.print("Nhập b: ");
        double b = sc.nextInt();
        double x = (-b)/a;
        System.out.println("x = " + x);
    }
}