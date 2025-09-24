import java.util.Scanner;

public class exercises_2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhập tọa độ điểm A");
        System.out.print("xA: ");
        double xA = sc.nextDouble();
        System.out.print("yA: ");
        double yA = sc.nextDouble();
        System.out.println("Nhập tọa độ điểm B");
        System.out.print("xB: ");
        double xB = sc.nextDouble();
        System.out.print("yB: ");
        double yB = sc.nextDouble();

        double AB  = Math.sqrt((xB - xA)*(xB -  xA) + (yB - yA)*(yB - yA));
        System.out.println("Khoảng cách |AB| là: " + AB);
    }
}
