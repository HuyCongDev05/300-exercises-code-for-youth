import java.util.Arrays;
import java.util.Scanner;

public class exercises_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("Nhập vào a, b, c: ");
        String abc = sc.nextLine();
        int a = Integer.parseInt(abc.split(" ")[0]);
        int b = Integer.parseInt(abc.split(" ")[1]);
        int c = Integer.parseInt(abc.split(" ")[2]);
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.stream(arr).sorted().forEach(x -> System.out.print(x + " "));
    }
}
