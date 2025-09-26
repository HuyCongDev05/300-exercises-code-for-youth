import java.util.Scanner;

public class exercises_9 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhập vào số đo x của góc (phút): ");
        double x  = sc.nextDouble();
        double degree = x / 60;
        double radians =  Math.toRadians(degree);
        if (0 < radians && radians < Math.PI/2) {
            System.out.println("Góc vuông thứ 1");
        }else if (radians < Math.PI) {
            System.out.println("Góc vuông thứ 2");
        }else if (radians < (3*Math.PI)/2) {
            System.out.println("Góc vuông thứ 3");
        }else System.out.println("Góc vuông thứ 4");
    }
}
