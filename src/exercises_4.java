import java.util.Scanner;

public class exercises_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        double p = (a + b + c)/2;
        double S = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        if (c == Math.sqrt(a*a + b*b)) {
            System.out.println("Tam giác vuông");
        } else if (a == b && b == c) {
            System.out.println("Tam giác đều");
        } else if (b == c) {
            System.out.println("Tam giác giác cân");
        }else System.out.println("Tam giác thường");
        System.out.println("Diện tích S là: " + S);
    }
}