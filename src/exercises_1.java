import java.util.Scanner;

public class exercises_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập diện tích S: ");
        double S =  sc.nextDouble();
        double R = Math.sqrt(S/(4*Math.PI));
        double V = ((double) 4 /3)*Math.PI*Math.pow(R,3);
        System.out.println("Thể tích V: " + V);
    }
}