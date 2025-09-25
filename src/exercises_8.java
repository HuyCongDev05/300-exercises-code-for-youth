import java.util.Scanner;

public class exercises_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        while (true) {
            System.out.print("Nhập a: ");
            a = sc.nextDouble();
            if (a != 0) break;
            else System.out.println("a phải khác 0");
        }
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        if (delta == 0) {
            System.out.println("Nghiệm kép x1 = x2 = " + (-b/2*a));
        } else if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        }else  {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
