import java.util.Scanner;

public class exercises_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tọa độ tâm C");
        System.out.print("xC: ");
        double xC = sc.nextDouble();
        System.out.print("yC: ");
        double yC = sc.nextDouble();
        System.out.print("Nhập bán kính R: ");
        double R = sc.nextDouble();
        System.out.println("Nhập tọa độ M");
        System.out.print("xM: ");
        double xM = sc.nextDouble();
        System.out.print("yM: ");
        double yM = sc.nextDouble();

        double length = Math.sqrt((xM - xC)*(xM -  xC) + (yM - yC)*(yM - yC));
        if (length < R) {
            System.out.println("M nằm trong C");
        }else if (length > R) {
            System.out.println("M nằm ngoài C");
        }else System.out.println("M nằm trên C");
    }
}
